SUMMARY = "E-Mail Filter"
DESCRIPTION = "This program enables you to convert MIME, SUN mailtool, and 'plain old \
style RFC822'. \
 \
It is especially useful for elm users."
LICENSE = "GPL-2.0+"

PV = "2.1.0beta9"

RPM_NAME = "emil-2.1.0beta9-968.29.aarch64.rpm"
RPM_HASH = "85e59417b0289ba5d97917bc3843b8638f214a19b161a3218983ce8c83a31dc8acf284fca1955d3fec7d57b42d76a180f7feec2e4e3da16ebcd5a1b935147a8f"

RPROVIDES:${PN} += "config-emil \
emil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libresolv.so.2"

inherit rpm
