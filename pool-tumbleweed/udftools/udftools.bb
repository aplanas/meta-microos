SUMMARY = "UDF filesystem tools"
DESCRIPTION = "These are tools for UDF file systems as used, e.g., on DVD-ROMs."
LICENSE = "GPL-2.0-or-later"

PV = "2.3"

RPM_NAME = "udftools-2.3-1.11.aarch64.rpm"
RPM_HASH = "42554e4257fb73c2f6643c55b385c37b9b46fb3858d771367a429925e946954caa63c29372f065208a0907750665d888ded5f56c81f77603273b1b8cb4713700"

RPROVIDES:${PN} += "udf \
udftools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
