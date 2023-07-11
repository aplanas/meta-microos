SUMMARY = "Remote magnetic tape protocol server"
DESCRIPTION = "rmt is a program that can be used by e.g. star and ufsdump \
for accessing remote magnetic tape drives and files through an \
interprocess communication connection. \
 \
A tape client would launch something like ssh for the actual \
connection, and through that, have the rmt program executed."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "schily-rmt-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "abeb05ccb8870b6d81684f0bbeb723ed5785694a7d298fd1725f46dc2f9ffc38f6375e40d25cbc258212523bd783834e00cfb52fed7b28e181401a6fe0024395"

RPROVIDES:${PN} += "config-schily-rmt \
rmt \
schily-rmt \
star-rmt-/usr/bin/srmt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdeflt.so.1.0 \
libschily.so.2.0 \
update-alternatives"

inherit rpm
