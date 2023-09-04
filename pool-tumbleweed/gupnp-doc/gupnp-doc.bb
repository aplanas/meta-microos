SUMMARY = "Documentation for gupnp"
DESCRIPTION = "Documentation for GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.5"

RPM_NAME = "gupnp-doc-1.6.5-1.1.noarch.rpm"
RPM_HASH = "3f2fbc249a73aab662667dc0c186bbb01d8867312ed443c80fba088a826225abd6566ba8f7f4f75c5a7212acce7ca10833ad59fde864e768365fdb3ccd9dbbbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gupnp-doc"

RDEPENDS:${PN} += ""

inherit rpm
