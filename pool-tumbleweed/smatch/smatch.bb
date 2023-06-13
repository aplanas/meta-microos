SUMMARY = "Static analysis tool for C"
DESCRIPTION = "Smatch is a static analysis tool for C. Most of the checks are for the linux \
kernel. Please write checks for your project. It's fun and easy!"
LICENSE = "GPL-2.0-only"

PV = "1.72+20220506"

RPM_NAME = "smatch-1.72+20220506-1.8.aarch64.rpm"
RPM_HASH = "a22a6744a57e53e308a479dbcb4f1bda8ce6e53e32ba8595169226c831d095a8e14f339cb204b76d4bf08acf0d6b13a20400bbf9014013aa6cba0067ffd4d468"

RPROVIDES:${PN} += "smatch \
smatch(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
