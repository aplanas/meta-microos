SUMMARY = "Have a single source of version in your code base"
DESCRIPTION = "Utility to let you have a single source of version in your code base."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-single-version-1.5.1-1.11.noarch.rpm"
RPM_HASH = "78dfe7ecd669d5675f93c65a38ec4ecb0ddb84c33310db302b5f7651957961c090941022c0e6d499baaf009f2446cf578b6b18ba34653ca88a4b5847dcdfb1ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-single-version \
python39-single-version \
python3dist-single-version"

RDEPENDS:${PN} += "python-abi \
python39-first \
python39-importlib-metadata"

inherit rpm
