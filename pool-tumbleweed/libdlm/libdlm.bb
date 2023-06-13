SUMMARY = "Application interface to the kernel's distributed lock manager"
DESCRIPTION = "Libraries and tools that allow applications, particularly filesystems \
like OCFS2, to interface with the in-kernel distributed lock manager."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "libdlm-4.1.0-2.4.aarch64.rpm"
RPM_HASH = "c01019cbb793b87839b4eb7f0b556532a3a18ab88b114df200add8eba1927c182dc81f8bf809aeab57f7f1dc656ddb86341b5f267e30e28120b63aae04344cab"

RPROVIDES:${PN} += "libdlm \
libdlm(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcfg.so.6()(64bit) \
libcmap.so.4()(64bit) \
libcpg.so.4()(64bit) \
libdlm.so.3()(64bit) \
libdlmcontrol.so.3()(64bit) \
libquorum.so.5()(64bit) \
libuuid.so.1()(64bit)"

inherit rpm
