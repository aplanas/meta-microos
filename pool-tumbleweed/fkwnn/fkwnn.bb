SUMMARY = "Free kWnn Korean Input System"
DESCRIPTION = "Free kWnn Korean input system."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fkwnn-1.1.1a023.1-4.3.aarch64.rpm"
RPM_HASH = "eb25926e8a76b074d48b61739b52d2d4432ea1d5cf16d1b41bfa73a546d318f55ef81ab06174bc861e8055dba08399e3e3c07853f4de426292b6d7753d96e705"

RPROVIDES:${PN} += "config(fkwnn) \
fkwnn \
fkwnn(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
fwnncom \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libkwnn.so.0()(64bit) \
libtinfo.so.6()(64bit) \
libwrap.so.0()(64bit) \
shadow"

inherit rpm
