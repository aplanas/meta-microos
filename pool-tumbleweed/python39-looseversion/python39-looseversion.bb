SUMMARY = "A backwards/forwards-compatible fork of distutils.version.LooseVersion"
DESCRIPTION = "A backwards/forwards-compatible fork of distutils.version.LooseVersion, for times when PEP-440 isn't what you need. \
 \
The goal of this package is to be a drop-in replacement for the original LooseVersion. It implements an identical interface and comparison logic to LooseVersion. The only major change is that a looseversion.LooseVersion is comparable to a distutils.version.LooseVersion, which means tools should not need to worry whether all dependencies that use LooseVersion have migrated. \
 \
If you are simply comparing versions of Python packages, consider moving to packaging.version.Version, which follows PEP-440. LooseVersion is better suited to interacting with heterogeneous version schemes that do not follow PEP-440."
LICENSE = "PSF-2.0"

PV = "1.1.2"

RPM_NAME = "python39-looseversion-1.1.2-1.2.noarch.rpm"
RPM_HASH = "5e4e893dbf5ca6e02ab4696d76c03d046b55ea132a71faa89487e839bbf252ea4fa07292cedcc9e9f4ab435772068fb918a1e7ccc2be5aa76a03121705f15b72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(looseversion) \
python39-looseversion \
python3dist(looseversion)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
