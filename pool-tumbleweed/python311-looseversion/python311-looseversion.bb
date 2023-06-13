SUMMARY = "A backwards/forwards-compatible fork of distutils.version.LooseVersion"
DESCRIPTION = "A backwards/forwards-compatible fork of distutils.version.LooseVersion, for times when PEP-440 isn't what you need. \
 \
The goal of this package is to be a drop-in replacement for the original LooseVersion. It implements an identical interface and comparison logic to LooseVersion. The only major change is that a looseversion.LooseVersion is comparable to a distutils.version.LooseVersion, which means tools should not need to worry whether all dependencies that use LooseVersion have migrated. \
 \
If you are simply comparing versions of Python packages, consider moving to packaging.version.Version, which follows PEP-440. LooseVersion is better suited to interacting with heterogeneous version schemes that do not follow PEP-440."
LICENSE = "PSF-2.0"

PV = "1.1.2"

RPM_NAME = "python311-looseversion-1.1.2-1.2.noarch.rpm"
RPM_HASH = "e74457d3a8ddde58d528fa00208155089f5a4c646dd660c1e99d479664ed905f05b33dcc0e47db668880cde500a0eef2ebe976336195588fa9eba6eade273e8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(looseversion) \
python311-looseversion \
python3dist(looseversion)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
