SUMMARY = "Extra features for standard library's cmd module"
DESCRIPTION = "Enhancements for standard library's cmd module. \
 \
Drop-in replacement adds several features for command-prompt tools: \
 \
    * Searchable command history (commands: 'hi', 'li', 'run') \
    * Load commands from file, save to file, edit commands in file \
    * Multi-line commands \
    * Case-insensitive commands \
    * Special-character shortcut commands (beyond cmd's '@' and '!') \
    * Settable environment parameters \
    * Parsing commands with flags \
    * > (filename), >> (filename) redirect output to file \
    * < (filename) gets input from file \
    * bare >, >>, < redirect to/from paste buffer \
    * accepts abbreviated commands when unambiguous \
    * `py` enters interactive Python console \
    * test apps against sample session transcript (see example/example.py)"
LICENSE = "MIT"

PV = "2.4.3"

RPM_NAME = "python310-cmd2-2.4.3-1.5.noarch.rpm"
RPM_HASH = "abea3ac78e4afcbaf96f3752aff65db64944329436d1aaf18f13aad5d1dd76e356ad7f491f7ce81526c2e6c820a8244b7a7f138803a1dd1f5f1ee4da1f3729e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cmd2 \
python310-cmd2 \
python3dist-cmd2"

RDEPENDS:${PN} += "python-abi \
python310 \
python310-attrs \
python310-pyperclip \
python310-wcwidth"

inherit rpm
