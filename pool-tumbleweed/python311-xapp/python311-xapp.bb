SUMMARY = "Python XApp library"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.1"

RPM_NAME = "python311-xapp-2.2.1-1.16.noarch.rpm"
RPM_HASH = "eb504e363e5f9b6b210f7528661f5a3dc23d332fd52cb729a0dbe6ab455406c30fe387d3f386c36113467bbe31f398aa8ddfa410fd6845203cd832f51df7185a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-xapp) \
python311-xapp \
python3dist(python-xapp)"

RDEPENDS:${PN} += "python(abi) \
python311-psutil \
xdg-utils"

inherit rpm
