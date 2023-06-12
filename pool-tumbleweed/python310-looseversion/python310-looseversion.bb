SUMMARY = "A backwards/forwards-compatible fork of distutils.version.LooseVersion"
DESCRIPTION = "A backwards/forwards-compatible fork of distutils.version.LooseVersion, for times when PEP-440 isn't what you need. \
 \
The goal of this package is to be a drop-in replacement for the original LooseVersion. It implements an identical interface and comparison logic to LooseVersion. The only major change is that a looseversion.LooseVersion is comparable to a distutils.version.LooseVersion, which means tools should not need to worry whether all dependencies that use LooseVersion have migrated. \
 \
If you are simply comparing versions of Python packages, consider moving to packaging.version.Version, which follows PEP-440. LooseVersion is better suited to interacting with heterogeneous version schemes that do not follow PEP-440."
LICENSE = "PSF-2.0"

PV = "1.1.2"

RPM_NAME = "python310-looseversion-1.1.2-1.2.noarch.rpm"
RPM_HASH = "8bf2a034fdadd81cfba71a24d1dff57687c1328dca077273e50232698baceee6a4dcc46c4eac29f7d6a62836db614aae718a8d0e8ef4674426c9988cfacb9f79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-looseversion \
python3.10dist(looseversion) \
python310-looseversion \
python3dist(looseversion)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
