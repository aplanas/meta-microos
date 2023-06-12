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

RPM_NAME = "python310-cmd2-2.4.3-1.3.noarch.rpm"
RPM_HASH = "f7ca763fe006954c04cd8951c0d9d77e5524a71c1178ff7006a7e5e62687fe90103ad91b59e5dfec3119172c1df970760541ed81a82d41484441369dee92dd3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cmd2 \
python3.10dist(cmd2) \
python310-cmd2 \
python3dist(cmd2)"
RDEPENDS:${PN} += "python(abi) \
python310 \
python310-attrs \
python310-pyperclip \
python310-wcwidth"

inherit rpm
