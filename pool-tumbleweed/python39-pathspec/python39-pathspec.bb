SUMMARY = "Utility library for gitignore style pattern matching of file paths"
DESCRIPTION = "Pathspec is a utility library for pattern matching of file paths. So \
far this only includes Git's wildmatch pattern matching which itself is \
derived from Rsync's wildmatch. Git uses wildmatch for its `gitignore`_ \
files."
LICENSE = "MPL-2.0"

PV = "0.11.2"

RPM_NAME = "python39-pathspec-0.11.2-1.1.noarch.rpm"
RPM_HASH = "c0d385ff559090e876b1e3c17516600fe17332ac356153f08d99e6e569042e83e264dc45f74f8e43f9086b307b3c84ba905e35bdb164bbd903b36e3c7c520a39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pathspec \
python39-pathspec \
python3dist-pathspec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
