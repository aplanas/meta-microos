SUMMARY = "Git repository fixture for pytest"
DESCRIPTION = "Git repository fixture for py.test"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-git-1.7.0-2.13.noarch.rpm"
RPM_HASH = "634a60ee4e952be106feeaa65e4ffd955de0d5464e396db60cdf10bf4c64ac90ab9eac225d6faa9b2af8bec8a005732702e4ae3cb2ff0adfe2572336d95705fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-git \
python3.10dist(pytest-git) \
python310-pytest-git \
python3dist(pytest-git)"
RDEPENDS:${PN} += "python(abi) \
python310-GitPython \
python310-pytest \
python310-pytest-shutil"

inherit rpm
