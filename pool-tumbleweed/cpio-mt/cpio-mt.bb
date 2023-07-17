SUMMARY = "Tape drive control utility"
DESCRIPTION = "This package includes the 'mt', a local tape drive control program."
LICENSE = "GPL-3.0-only"

PV = "2.14"

RPM_NAME = "cpio-mt-2.14-1.1.aarch64.rpm"
RPM_HASH = "8dbe4df4af2d14423145fa87b438dd23271421351c7b4934acd229afae457274989cc851ddb6243f0c808392dfad3c6d9388572c96873e6f050ae0668b98124a"

RPROVIDES:${PN} += "cpio-mt \
mt"

RDEPENDS:${PN} += "/usr/bin/sh \
cpio \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
