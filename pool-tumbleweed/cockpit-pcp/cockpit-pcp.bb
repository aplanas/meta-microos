SUMMARY = "Cockpit PCP integration"
DESCRIPTION = "Cockpit support for reading PCP metrics and loading PCP archives."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-pcp-298-2.1.aarch64.rpm"
RPM_HASH = "d030b138d777ea409d7c953e85c393cf2627ecf857702589f85843198b6e1ea175cded2a7771a4f84a99d0bf1349bef8ddf007aef7bd08bfe49b9833c2adfb50"

RPROVIDES:${PN} += "cockpit-pcp"

RDEPENDS:${PN} += "/usr/bin/sh \
cockpit-bridge \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libpcp.so.3 \
pcp"

inherit rpm
