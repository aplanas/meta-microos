SUMMARY = "A library for reading OriginLab OPJ project files"
DESCRIPTION = "A library for reading OriginLab OPJ project files. \
Features: \
* reads any worksheets with all columns \
* supports 4.1, 5.0, 6.0, 6.1, 7.0, 7.5 projects"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "liborigin3-3.0.1-1.11.aarch64.rpm"
RPM_HASH = "572e7141824176455f6a3a66bca6e9aa03e1f6aede14054694a230e9abad2a1a7a26b2ae0db0bb33bebd8c72573b9381139c8381fcaf4abe0dd46f4efef1df6f"

RPROVIDES:${PN} += "liborigin.so.3 \
liborigin3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
