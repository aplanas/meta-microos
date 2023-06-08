SUMMARY = "SUSE Linux Default Permissions tool"
DESCRIPTION = "Tool to check and set file permissions."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20230424"

RPM_NAME = "chkstat-1699_20230424-1.1.aarch64.rpm"
RPM_HASH = "871278668d869182de31061de5aa8e3433b7ae0a03524ec4d9f352128dad74d06fa70ec9fc0e3b2226736515f10ac29bdd92e68f4a4dc19fbb46f7ee38952d89"

RPROVIDES:${PN} += "chkstat chkstat(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit) libcap.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
