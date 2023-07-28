SUMMARY = "Simple font dumper"
DESCRIPTION = "Simple font dumper \
This tool is part of the FreeType project"
LICENSE = "FTL & GPL-2.0-only"

PV = "2.13.1"

RPM_NAME = "ftdump-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "bcc25e220ca1c605b7a350c5ae7d1b68f3d4886099ac8269be8e3e67688aae43c54cc0be64c48e92d6e5552bb39bef4cdf44a3ae679266b8813f17b785807556"

RPROVIDES:${PN} += "ftdump"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
