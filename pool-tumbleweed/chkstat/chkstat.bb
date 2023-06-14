SUMMARY = "SUSE Linux Default Permissions tool"
DESCRIPTION = "Tool to check and set file permissions."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20230516"

RPM_NAME = "chkstat-1699_20230516-1.1.aarch64.rpm"
RPM_HASH = "7ac6368621412306d567757e7504a85749b7abdf3d5d79bfbe62a8518b86773c036e9bc784b4efa69dd63d8832eaeaa8203e88783873058dc37db72017ffda20"

RPROVIDES:${PN} += "chkstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libgcc-s.so.1"

inherit rpm
