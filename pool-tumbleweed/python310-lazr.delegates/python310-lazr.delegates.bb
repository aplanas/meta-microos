SUMMARY = "Easily write objects that delegate behavior"
DESCRIPTION = "Easily write objects that delegate behavior"
LICENSE = "LGPL-3.0-only"

PV = "2.0.4"

RPM_NAME = "python310-lazr.delegates-2.0.4-1.13.noarch.rpm"
RPM_HASH = "ad8b3fd79636154db0cdc50b32a84b293a94c9cdc06e08ee95e9957623ea8d923a2feefee7ff65b0b30fdc50db8e50ed12622fee5274514ae71892737031c27b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazr.delegates \
python3.10dist-lazr.delegates \
python310-lazr.delegates \
python3dist-lazr.delegates"

RDEPENDS:${PN} += "python-abi \
python310-zope.interface"

inherit rpm
