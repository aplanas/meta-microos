SUMMARY = "Development for ATM"
DESCRIPTION = "Libraries and header files for ATM (Asynchronous Transfer Mode) \
networking."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.5.2"

RPM_NAME = "linux-atm-devel-2.5.2-8.9.aarch64.rpm"
RPM_HASH = "fbbf3db71037b5154eabe71aad947d1c930e92b012096ce1212aa5d8e0b61f8c81e674217da085851931fa6369df87f4c6f9598dfeef78292e43749fceb54ae4"

RPROVIDES:${PN} += "linux-atm-devel"

RDEPENDS:${PN} += "libatm1"

inherit rpm
