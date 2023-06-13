SUMMARY = "Utility for storing metadata in a LUKSv1 header"
DESCRIPTION = "The luksmeta utility enables an administrator to store metadata in the gap \
between the end of the LUKSv1 header and the start of the encrypted data."
LICENSE = "LGPL-2.1-or-later"

PV = "9"

RPM_NAME = "luksmeta-9-1.1.aarch64.rpm"
RPM_HASH = "5965f576e708e485ff636b96f77907c4fe9eae6bf8c54554af1b87aac292aa802b0c046c1098cb70dad7cea5bc76ad317e17fa806ad6f951b7676a8a71f62257"

RPROVIDES:${PN} += "luksmeta \
luksmeta(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcryptsetup.so.12()(64bit) \
libluksmeta.so.0()(64bit)"

inherit rpm
