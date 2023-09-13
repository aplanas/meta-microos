SUMMARY = "Utility library for gitignore style pattern matching of file paths"
DESCRIPTION = "Pathspec is a utility library for pattern matching of file paths. So \
far this only includes Git's wildmatch pattern matching which itself is \
derived from Rsync's wildmatch. Git uses wildmatch for its `gitignore`_ \
files."
LICENSE = "MPL-2.0"

PV = "0.11.2"

RPM_NAME = "python310-pathspec-0.11.2-1.1.noarch.rpm"
RPM_HASH = "18465a80b0aaf3b3a0eb3010f4b79ae5b6a9982cfe71cf2e0ec9332963161ea00dd093bd7da5938ab2e076de851910ab7998756c60017a39d20f56ba98a048c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pathspec \
python310-pathspec \
python3dist-pathspec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
