SUMMARY = "Header files for the NetPBM libraries"
DESCRIPTION = "These are the libs for the netpbm graphic formats. The tools can be \
found in the netpbm package. The sources are contained in the netpbm \
source package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & IJG & MIT & SUSE-Public-Domain"

PV = "11.2.0"

RPM_NAME = "libnetpbm-devel-11.2.0-1.1.aarch64.rpm"
RPM_HASH = "7f235747e1e3c86b780d4359fd21a76f1a2f2880cec6a8642163d5ef28cbb71891ded51f71cd95fb7f46dfb2690d98f1b9f84d779426d0697ad986bdd1181723"

RPROVIDES:${PN} += "libnetpbm-devel"

RDEPENDS:${PN} += "libnetpbm11"

inherit rpm
