SUMMARY = "UDF filesystem tools"
DESCRIPTION = "These are tools for UDF file systems as used, e.g., on DVD-ROMs."
LICENSE = "GPL-2.0-or-later"

PV = "2.3"

RPM_NAME = "udftools-2.3-1.10.aarch64.rpm"
RPM_HASH = "f5b2b4a88f8dbd3f27170d5989a5d6090b021b9859e88b3e8f052fafb5dedd895d1146baf68e357f37bd5568783f80a73406e40c4cc83b8b670710c5801f5e90"

RPROVIDES:${PN} += "udf \
udftools \
udftools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
