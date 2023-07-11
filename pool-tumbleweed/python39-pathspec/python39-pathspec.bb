SUMMARY = "Utility library for gitignore style pattern matching of file paths"
DESCRIPTION = "Pathspec is a utility library for pattern matching of file paths. So \
far this only includes Git's wildmatch pattern matching which itself is \
derived from Rsync's wildmatch. Git uses wildmatch for its `gitignore`_ \
files."
LICENSE = "MPL-2.0"

PV = "0.11.1"

RPM_NAME = "python39-pathspec-0.11.1-2.3.noarch.rpm"
RPM_HASH = "76fb94c19556a6878df429f6d4af6761571a268574f5da4e975365dc0234ac110892281ee4bf2171db8034afba007177648e6a6b376a6dfdc5bc88cea55ba26d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pathspec \
python39-pathspec \
python3dist-pathspec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
