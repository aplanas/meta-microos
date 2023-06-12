SUMMARY = "SUSE Linux Default Permissions tool"
DESCRIPTION = "Tool to check and set file permissions."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20230516"

RPM_NAME = "chkstat-1699_20230516-1.1.aarch64.rpm"
RPM_HASH = "7ac6368621412306d567757e7504a85749b7abdf3d5d79bfbe62a8518b86773c036e9bc784b4efa69dd63d8832eaeaa8203e88783873058dc37db72017ffda20"

RPROVIDES:${PN} += "chkstat \
chkstat(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcap.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
