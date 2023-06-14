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

RPM_NAME = "python311-cmd2-2.4.3-1.3.noarch.rpm"
RPM_HASH = "676197867e2e2f0abae2b6004ecd6cd2ece145da0d41ea23fa78252ed2541aaa956718ceb12832563b62431f9a601ee6e3bd8bf3ae57a883a9a59e145f41f4cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-cmd2 \
python311-cmd2 \
python3dist-cmd2"

RDEPENDS:${PN} += "python-abi \
python311 \
python311-attrs \
python311-pyperclip \
python311-wcwidth"

inherit rpm
