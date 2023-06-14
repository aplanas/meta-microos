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

RPM_NAME = "python39-cmd2-2.4.3-1.3.noarch.rpm"
RPM_HASH = "91133c6a3d23d0f8df0bc703c9cecf8aad200e7b13285cd088558661fe7e127fe81bcca7923c230a58e79bf3477372cada70d2c3ac03836ee43d9aabbf4bdcd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cmd2 \
python39-cmd2 \
python3dist-cmd2"

RDEPENDS:${PN} += "python-abi \
python39 \
python39-attrs \
python39-pyperclip \
python39-wcwidth"

inherit rpm
