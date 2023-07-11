SUMMARY = "A termcap implementation"
DESCRIPTION = "An implementation of termcap, i.e. the termcap C functions tgetent, tputs, \
etc., including the parser for the /usr/share/misc/termcap file."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libxtermcap1_0-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "971295f697ed6d61ab09c8cab0c6f763b273968f9c24408093703b89d14a84c190c71358cf41d79d4d41a4e9baca751935cc46098cf45c9a2a54a11cfaf05d27"

RPROVIDES:${PN} += "libxtermcap.so.1.0 \
libxtermcap1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
