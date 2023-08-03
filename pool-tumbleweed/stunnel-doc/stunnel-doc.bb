SUMMARY = "Documentation for the universal TLS Tunnel"
DESCRIPTION = "This package contains additional documentation for the stunnel program."
LICENSE = "GPL-2.0-or-later"

PV = "5.70"

RPM_NAME = "stunnel-doc-5.70-1.1.noarch.rpm"
RPM_HASH = "2b137524e5d97e1eb3acc0e76d44cc875d7f9e64f38c95b75d3743ddd2772d4a7dc2de461a5576d0969c7b3026aae8356986af688c4ee037ce7105ebb0669824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stunnel-doc"

RDEPENDS:${PN} += "stunnel"

inherit rpm
