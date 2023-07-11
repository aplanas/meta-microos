SUMMARY = "Toolkit of common functions used across GrimoireLab"
DESCRIPTION = "Toolkit of common functions used across GrimoireLab projects. \
 \
This package provides a library composed by functions widely used in other \
GrimoireLab projects. These function deal with date handling, introspection, \
URIs/URLs, among other topics."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.4"

RPM_NAME = "python39-grimoirelab-toolkit-0.3.4-1.1.noarch.rpm"
RPM_HASH = "8b25f494356a53922eab0ce123822bfcc17bac3b848778cd5adfd92588da5061b1c2deaf3c6da33aa958645923561308d93123db74282aa2db34da5b0e075b3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-grimoirelab-toolkit \
python39-grimoirelab-toolkit \
python3dist-grimoirelab-toolkit"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil"

inherit rpm
