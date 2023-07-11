SUMMARY = "HTML to ASCII Converter"
DESCRIPTION = "A tool for converting from HTML to ASCII. It can reasonably handle \
tables."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.1"

RPM_NAME = "html2text-2.1.1-1.4.aarch64.rpm"
RPM_HASH = "dff1e6c18cc3104411ed9c98588fcc5457b57ed6936ff8acd3dc8d4afecab24cce67f18fdb9116b79ce0d9613df498f3aba1f3b07c967d48437f5c9644285d47"

RPROVIDES:${PN} += "html2text"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
