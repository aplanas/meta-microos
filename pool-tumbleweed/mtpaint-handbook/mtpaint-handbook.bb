SUMMARY = "Handbook for the mtpaint painting application"
DESCRIPTION = "Documentation for the painting application mtpaint."
LICENSE = "GFDL-1.2-only"

PV = "3.50"

RPM_NAME = "mtpaint-handbook-3.50-1.11.noarch.rpm"
RPM_HASH = "05d69c7291ff6c26b6e249947800058ec1b35d5b6d9b3be6b30d6935bb84859ae380720934ff4dc85555a5666eac3408fbea37e1a87f3bf13acab453569a8391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mtpaint-handbook"

RDEPENDS:${PN} += "mtpaint"

inherit rpm
