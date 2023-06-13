SUMMARY = "Utility to find python versions on your system"
DESCRIPTION = "Discover which versions of the Python interpreter are present on your \
system."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "python311-findpython-0.2.5-1.1.noarch.rpm"
RPM_HASH = "30eb48702ba252aa38cdc3aded3c0e34bb0c7f9a9884afc9c6e3e97098c54492585491471c94120e341c497781cb618b45258c2f3c7ef69dcf0e78b1e056e69a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(findpython) \
python311-findpython \
python3dist(findpython)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-packaging \
update-alternatives"

inherit rpm
