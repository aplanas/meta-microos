SUMMARY = "TIST plugin for connman"
DESCRIPTION = "Provides TI Shared Transport support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-tist-1.41-4.8.aarch64.rpm"
RPM_HASH = "4c2c09c0b3715923fdbf8d6fe7721d5bbd92fb2934bbee41af693dcafad783025e8f9ef4924cf6afac93a497b1463c3ac6bdc641a0d3d20075c6658994bb8c50"

RPROVIDES:${PN} += "connman-plugin-tist"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
