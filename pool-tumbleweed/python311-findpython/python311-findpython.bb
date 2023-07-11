SUMMARY = "Utility to find python versions on your system"
DESCRIPTION = "Discover which versions of the Python interpreter are present on your \
system."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "python311-findpython-0.2.5-2.1.noarch.rpm"
RPM_HASH = "426d82dd71748b707ec8cd7dd74be1cc717e5300817156b331ec070c6cc6379e24ade9064c973aa0aace9e0cbc9981a2b17b49f83e972c676063b79565e5a5fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-findpython \
python3.11dist-findpython \
python311-findpython \
python3dist-findpython"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-packaging \
update-alternatives"

inherit rpm
