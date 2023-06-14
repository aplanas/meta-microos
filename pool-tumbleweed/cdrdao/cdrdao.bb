SUMMARY = "Tool to write CD-Rs in Disk-At-Once Mode"
DESCRIPTION = "CDRDAO creates CD-Rs in disk-at-once (DAO) mode driven by a description \
file called a TOC file. In DAO mode, it is possible to create \
non-standard track pregaps that have lengths other than 2 seconds and \
contain nonzero audio data. This is useful for dividing live recordings \
into tracks where 2 second gaps would be irritating."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "cdrdao-1.2.4-1.13.aarch64.rpm"
RPM_HASH = "3cc2d27b59c6ccd139a8d564646e5f0116f9484fa7c1cafaacf98e6e5ac2e281104a60da2ca11510bbce8538f54fb34206486ef43953c67718c0354786e422c4"

RPROVIDES:${PN} += "cdrdao"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libao.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libmad.so.0 \
libstdc++.so.6 \
libvorbisfile.so.3"

inherit rpm
