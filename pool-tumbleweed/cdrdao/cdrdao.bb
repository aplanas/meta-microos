SUMMARY = "Tool to write CD-Rs in Disk-At-Once Mode"
DESCRIPTION = "CDRDAO creates CD-Rs in disk-at-once (DAO) mode driven by a description \
file called a TOC file. In DAO mode, it is possible to create \
non-standard track pregaps that have lengths other than 2 seconds and \
contain nonzero audio data. This is useful for dividing live recordings \
into tracks where 2 second gaps would be irritating."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "cdrdao-1.2.4-1.14.aarch64.rpm"
RPM_HASH = "206fdc3a8fc8fa11aefe3edd1f136a3cfed92998b24c847d033c221f6290164ab54ac120f3a8c84ffda0fcf4e55c407ea9d5970af1d65b70005a5269f1034cfc"

RPROVIDES:${PN} += "cdrdao"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libao.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libmad.so.0 \
libstdc++.so.6 \
libvorbisfile.so.3"

inherit rpm
