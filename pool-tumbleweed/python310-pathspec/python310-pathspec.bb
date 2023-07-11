SUMMARY = "Utility library for gitignore style pattern matching of file paths"
DESCRIPTION = "Pathspec is a utility library for pattern matching of file paths. So \
far this only includes Git's wildmatch pattern matching which itself is \
derived from Rsync's wildmatch. Git uses wildmatch for its `gitignore`_ \
files."
LICENSE = "MPL-2.0"

PV = "0.11.1"

RPM_NAME = "python310-pathspec-0.11.1-2.3.noarch.rpm"
RPM_HASH = "28f3893791508317d0b88bcfd816f8daeb676ec7f62abf9bca4a02f4997a2bf9872eb348d6f6ae8ec9e7f00e582875c37aba4ad63aad04afab754c13e19b159f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pathspec \
python310-pathspec \
python3dist-pathspec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
