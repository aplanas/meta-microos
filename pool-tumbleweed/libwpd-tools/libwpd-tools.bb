SUMMARY = "Tool from libwpd, a library for importing WordPerfect documents"
DESCRIPTION = "Tools to transform WordPerfect Documents into other formats. Currently \
supported: html, raw, text"
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.10.3"

RPM_NAME = "libwpd-tools-0.10.3-3.8.aarch64.rpm"
RPM_HASH = "264d03b2e217c0f797db75200d3f35a79255369eebbe02bdb46ba94d2612eff23ce265e880e80526382540998fdbeedecd114ede739ddb973518179e87e2e684"

RPROVIDES:${PN} += "libwpd-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libwpd-0.10.so.10"

inherit rpm
