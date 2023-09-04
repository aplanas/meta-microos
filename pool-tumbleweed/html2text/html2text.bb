SUMMARY = "HTML to text converter"
DESCRIPTION = "A tool for converting from HTML to text. It can reasonably handle tables."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.3"

RPM_NAME = "html2text-2.2.3-1.1.aarch64.rpm"
RPM_HASH = "66200556d903f74c7509315b880e3283b08d8be8672b5173283452c0b3ba4c83acee318583315130a05bf927f32c17c8cd600371d65a07c5c395e650c7f93701"

RPROVIDES:${PN} += "html2text"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
