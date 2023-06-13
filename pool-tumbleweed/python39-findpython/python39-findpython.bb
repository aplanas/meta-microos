SUMMARY = "Utility to find python versions on your system"
DESCRIPTION = "Discover which versions of the Python interpreter are present on your \
system."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "python39-findpython-0.2.5-1.1.noarch.rpm"
RPM_HASH = "10c81eb07374cb24cadc8716bc7fb01fee7df3094f2b6e955c39b205a233e97c0f0ca904a02d84c49ca5b8575ee5b14d5818c2fc3b78c656c50104c5d96f26bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(findpython) \
python39-findpython \
python3dist(findpython)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-packaging \
update-alternatives"

inherit rpm
