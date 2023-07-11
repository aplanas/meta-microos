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

RPM_NAME = "python311-cmd2-2.4.3-1.5.noarch.rpm"
RPM_HASH = "186ea2f422066c067dd112371c0a8f5fb14c301707c6a7614154afe7012d59bbbe2d321a02f502ec459e17aa01e7da7ae8e92679bfde20e394fe460a704c4202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cmd2 \
python3.11dist-cmd2 \
python311-cmd2 \
python3dist-cmd2"

RDEPENDS:${PN} += "python-abi \
python311 \
python311-attrs \
python311-pyperclip \
python311-wcwidth"

inherit rpm
