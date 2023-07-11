SUMMARY = "A backwards/forwards-compatible fork of distutils.version.LooseVersion"
DESCRIPTION = "A backwards/forwards-compatible fork of distutils.version.LooseVersion, for times when PEP-440 isn't what you need. \
 \
The goal of this package is to be a drop-in replacement for the original LooseVersion. It implements an identical interface and comparison logic to LooseVersion. The only major change is that a looseversion.LooseVersion is comparable to a distutils.version.LooseVersion, which means tools should not need to worry whether all dependencies that use LooseVersion have migrated. \
 \
If you are simply comparing versions of Python packages, consider moving to packaging.version.Version, which follows PEP-440. LooseVersion is better suited to interacting with heterogeneous version schemes that do not follow PEP-440."
LICENSE = "PSF-2.0"

PV = "1.1.2"

RPM_NAME = "python311-looseversion-1.1.2-1.4.noarch.rpm"
RPM_HASH = "19291098ce8c63e0cc54592c48c59306d7fe17706fb453a803aca369b85e246794160a58c66859352ab5d3c765be06e8498542635b487dc7227cb6da9d391cfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-looseversion \
python3.11dist-looseversion \
python311-looseversion \
python3dist-looseversion"

RDEPENDS:${PN} += "python-abi"

inherit rpm
