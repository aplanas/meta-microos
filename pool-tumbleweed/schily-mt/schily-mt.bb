SUMMARY = "Magnetic tape control"
DESCRIPTION = "The mt/smt program sends commands to a local or a remote magnetic \
tape drive."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "schily-mt-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "826ae87a96b17ce5a017763c4fcc07523e87d719eb0810495ea89cfb445bc13bbda8f19356f2c0e60e97246b5a63fc9aa278715d0300d5902a81f0016351eb79"

RPROVIDES:${PN} += "mt \
schily-mt \
star-rmt-/usr/bin/smt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
librmt.so.1.0 \
libschily.so.2.0 \
update-alternatives"

inherit rpm
