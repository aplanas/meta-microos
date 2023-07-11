SUMMARY = "Rsh compatibility package for mrcp/mrlogin/mrsh"
DESCRIPTION = "This package provides rsh compatibility for mrcp/mrlogin/mrsh"
LICENSE = "GPL-2.0-or-later"

PV = "2.12"

RPM_NAME = "mrsh-rsh-compat-2.12-13.4.aarch64.rpm"
RPM_HASH = "6191d7ddaffe82129ac481b4e23e2989fd797b0d522ac03d82730ecf6078bdd58b5e22d05a6023512cb26d55d6793213726e219ee8f711a4933fbcfd4a0381c7"

RPROVIDES:${PN} += "mrsh-rsh-compat \
rsh"

RDEPENDS:${PN} += "mrsh"

inherit rpm
