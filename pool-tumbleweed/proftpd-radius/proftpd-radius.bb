SUMMARY = "Radius Module for ProFTPD"
DESCRIPTION = "This is the Radius Module for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-radius-1.3.7f-1.3.aarch64.rpm"
RPM_HASH = "c759a9944363f2ded2353d32dd0cb39d2b3ea42f547af4d64498938b65652655f7c7856475885f7442f433f53ad8bd8f6367c8a65ae3a1494a1cdd18d0d7efa4"

RPROVIDES:${PN} += "proftpd-radius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
proftpd"

inherit rpm
