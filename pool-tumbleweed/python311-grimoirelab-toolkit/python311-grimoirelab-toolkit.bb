SUMMARY = "Toolkit of common functions used across GrimoireLab"
DESCRIPTION = "Toolkit of common functions used across GrimoireLab projects. \
 \
This package provides a library composed by functions widely used in other \
GrimoireLab projects. These function deal with date handling, introspection, \
URIs/URLs, among other topics."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.4"

RPM_NAME = "python311-grimoirelab-toolkit-0.3.4-1.1.noarch.rpm"
RPM_HASH = "019786fc96a57a44434af8ded1148fc9e95809e5d251bdb4d237e48ce27b471054fde32fd28801bf5b333859f38c09452b9edade45ad96dd33a15acb2d505ef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-grimoirelab-toolkit \
python3.11dist-grimoirelab-toolkit \
python311-grimoirelab-toolkit \
python3dist-grimoirelab-toolkit"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil"

inherit rpm
