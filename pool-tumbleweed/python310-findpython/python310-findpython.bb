SUMMARY = "Utility to find python versions on your system"
DESCRIPTION = "Discover which versions of the Python interpreter are present on your \
system."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "python310-findpython-0.2.5-2.1.noarch.rpm"
RPM_HASH = "5e63fbeb843fd9f9e55137d55f46a670cf8b3d053024ceea52b8b13e409fc04200bf901bbff0b39a74434a6e3b4826cca6a38efeae150da28bce378053dca0fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-findpython \
python310-findpython \
python3dist-findpython"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-packaging \
update-alternatives"

inherit rpm
