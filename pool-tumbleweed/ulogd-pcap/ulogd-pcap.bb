SUMMARY = "pcap output target for ulogd"
DESCRIPTION = "pcap output target for ulogd."
LICENSE = "GPL-2.0-only"

PV = "2.0.8"

RPM_NAME = "ulogd-pcap-2.0.8-1.1.aarch64.rpm"
RPM_HASH = "3a3e8022154ad3f81fb30ec35001a861e83c6a58918111c89fbd0b742505dffb6267c96fd30f9bde383b8fe13be6915ca1f6b463ce15535be91d43b4ec3dcaa3"

RPROVIDES:${PN} += "ulogd-pcap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
ulogd"

inherit rpm
