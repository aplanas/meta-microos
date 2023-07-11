SUMMARY = "Japan datum grids for Proj"
DESCRIPTION = "Japan datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-jp-9.2.1-1.1.noarch.rpm"
RPM_HASH = "7d6de91495e73b1af6234deb09fc574d4a5182b75788e87d0cb8b3e7f1e900995814b9fbbf074493471b9a14bed167575aa917c0b5009f24074ba2244c7cc553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-jp"

RDEPENDS:${PN} += ""

inherit rpm
