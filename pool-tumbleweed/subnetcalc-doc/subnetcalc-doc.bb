SUMMARY = "Documentation for subnetcalc"
DESCRIPTION = "SubNetCalc is an IPv4/IPv6 subnet address calculator. \
This packages provides documentation and help files for subnetcalc."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.22"

RPM_NAME = "subnetcalc-doc-2.4.22-1.1.noarch.rpm"
RPM_HASH = "12944fecd12f78aedf06216dca1d6cb3452ddd0b001dabe701674c5183891d9124496ccbc58d6bd891995421795eecee6991191cd1aa00382325cd67908dd617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "subnetcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
