SUMMARY = "A backwards/forwards-compatible fork of distutils.version.LooseVersion"
DESCRIPTION = "A backwards/forwards-compatible fork of distutils.version.LooseVersion, for times when PEP-440 isn't what you need. \
 \
The goal of this package is to be a drop-in replacement for the original LooseVersion. It implements an identical interface and comparison logic to LooseVersion. The only major change is that a looseversion.LooseVersion is comparable to a distutils.version.LooseVersion, which means tools should not need to worry whether all dependencies that use LooseVersion have migrated. \
 \
If you are simply comparing versions of Python packages, consider moving to packaging.version.Version, which follows PEP-440. LooseVersion is better suited to interacting with heterogeneous version schemes that do not follow PEP-440."
LICENSE = "PSF-2.0"

PV = "1.1.2"

RPM_NAME = "python39-looseversion-1.1.2-1.4.noarch.rpm"
RPM_HASH = "978ef0e04d9707eb5285041572d9f820485c6be18251c2d31b122b91b8f6f71816704f8e5e0c2a002db22682e3a4571fd9298effd43070948dfa7b5502188425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-looseversion \
python39-looseversion \
python3dist-looseversion"

RDEPENDS:${PN} += "python-abi"

inherit rpm
