SUMMARY = "Base library for Heimdal Kerberos"
DESCRIPTION = "This package contains the base library for Heimdal Kerberos."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libheimbase1-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "8cb29812ed902e66e670a8cabf42daa5c28d5811670fed01c2678ccc128a3c57995300f7ed35292cc4576609db314387baaf5041b794779beea29082eaad24bb"

RPROVIDES:${PN} += "libheimbase.so.1 \
libheimbase1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
