SUMMARY = "Documentation for subnetcalc"
DESCRIPTION = "SubNetCalc is an IPv4/IPv6 subnet address calculator. \
This packages provides documentation and help files for subnetcalc."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.21"

RPM_NAME = "subnetcalc-doc-2.4.21-1.3.noarch.rpm"
RPM_HASH = "d91596f4bbbbe9d50767387909449991f924c05ec79ce66f1d64b7ce88b9d7fbd7cd295c017d89dbd6febd6bb516f8e4f26575e442f8135eed8648a3b54ae930"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "subnetcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
