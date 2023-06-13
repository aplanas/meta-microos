SUMMARY = "Python library to sanitize/validate a string such as filenames"
DESCRIPTION = "pathvalidate is a Python library to sanitize/validate a string such as \
filenames/file-paths/etc."
LICENSE = "MIT"

PV = "2.5.2"

RPM_NAME = "python310-pathvalidate-2.5.2-1.2.noarch.rpm"
RPM_HASH = "49c667d030fe19d56fcc40325795be914a0578a24028e1a06182095faaebc73b62f23541c31db316c9290889ccf71e15ffe700352676141f9441717f06186293"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pathvalidate \
python3.10dist(pathvalidate) \
python310-pathvalidate \
python3dist(pathvalidate)"

RDEPENDS:${PN} += "python(abi) \
python310-setuptools"

inherit rpm
