SUMMARY = "Utility library for gitignore style pattern matching of file paths"
DESCRIPTION = "Pathspec is a utility library for pattern matching of file paths. So \
far this only includes Git's wildmatch pattern matching which itself is \
derived from Rsync's wildmatch. Git uses wildmatch for its `gitignore`_ \
files."
LICENSE = "MPL-2.0"

PV = "0.11.1"

RPM_NAME = "python311-pathspec-0.11.1-2.3.noarch.rpm"
RPM_HASH = "cd7857f159fd2381bb9e8990fead69784064a752206d9cd32a0b0a7e0049e0b5f0aba8e121f2c91dad02838dcb452073c18905ab4e2e9122e08e29f2d0630b1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pathspec \
python3.11dist-pathspec \
python311-pathspec \
python3dist-pathspec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
