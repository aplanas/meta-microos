SUMMARY = "SUSE Linux Default Permissions tool"
DESCRIPTION = "Tool to check and set file permissions."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20230602"

RPM_NAME = "chkstat-1699_20230602-1.3.aarch64.rpm"
RPM_HASH = "c6ff2dce2290a639c62b07ffcef23f2f72781dfdef68b6c0f67ec5e1ae42bc96d467c145128795a6a2c50896e4a9bfa78bc1635b22c4138e689fe7ad9a054a5e"

RPROVIDES:${PN} += "chkstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libgcc-s.so.1"

inherit rpm
