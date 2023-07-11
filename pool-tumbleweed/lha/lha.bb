SUMMARY = "Pack Program"
DESCRIPTION = "Lha is a packer comparable to ZIP (PKZIP), ZOO, and others. It has been \
included for compatibility reasons only. Use GZIP for general archiving \
purposes, because it is the standard for Linux."
LICENSE = "SUSE-Public-Domain"

PV = "1.14.1~git.20230329"

RPM_NAME = "lha-1.14.1~git.20230329-1.2.aarch64.rpm"
RPM_HASH = "33d7385ed535a4e7a08c6916019d7418c8a0a376c87ba8c1404e03dddce5c28846cfd939c3d2b485d7b13653756f76efeeebd1c2aa6571b60e20a94fa369eae5"

RPROVIDES:${PN} += "lha"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
