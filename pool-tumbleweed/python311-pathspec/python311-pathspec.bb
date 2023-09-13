SUMMARY = "Utility library for gitignore style pattern matching of file paths"
DESCRIPTION = "Pathspec is a utility library for pattern matching of file paths. So \
far this only includes Git's wildmatch pattern matching which itself is \
derived from Rsync's wildmatch. Git uses wildmatch for its `gitignore`_ \
files."
LICENSE = "MPL-2.0"

PV = "0.11.2"

RPM_NAME = "python311-pathspec-0.11.2-1.1.noarch.rpm"
RPM_HASH = "92c12afe3a5d7ae4b418c5aa09aa97080364a60e82026f9635e6559ee020ec04465ab81d286370cbc7c2a2addcc664d10bcd6544eba7f9a218f2da37030d388c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pathspec \
python3.11dist-pathspec \
python311-pathspec \
python3dist-pathspec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
