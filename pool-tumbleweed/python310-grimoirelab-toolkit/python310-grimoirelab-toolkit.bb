SUMMARY = "Toolkit of common functions used across GrimoireLab"
DESCRIPTION = "Toolkit of common functions used across GrimoireLab projects. \
 \
This package provides a library composed by functions widely used in other \
GrimoireLab projects. These function deal with date handling, introspection, \
URIs/URLs, among other topics."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.4"

RPM_NAME = "python310-grimoirelab-toolkit-0.3.4-1.1.noarch.rpm"
RPM_HASH = "9610450cf1ee4cc4b0121b9ea00be0ee19c4f6c12de985bc8c1b9450b38c552fa11d6c74e8e017f96f75fa070fd22572f94ce8faac718c96e2f0bc18f71130a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-grimoirelab-toolkit \
python310-grimoirelab-toolkit \
python3dist-grimoirelab-toolkit"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil"

inherit rpm
