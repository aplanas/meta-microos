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

RPM_NAME = "python39-cmd2-2.4.3-1.5.noarch.rpm"
RPM_HASH = "1a1e8a2b1a1d724dd4e2bbca97970eea15f50a68fc8903bb7c034d94c1d60bcbc8bfa0c3a886a12b6203556af3b60d409037d6e7003ffea6a8f679991d2b6de5"
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
