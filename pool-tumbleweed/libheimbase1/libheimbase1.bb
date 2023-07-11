SUMMARY = "Base library for Heimdal Kerberos"
DESCRIPTION = "This package contains the base library for Heimdal Kerberos."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libheimbase1-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "980da1d6653fe28b2730d0799c35af69687c7e9fe26b4f9c6eccc15ceef7a6c01b35e22e337fadafb5cca423039ac8acad45ce5f27ace45fe020e57ccd0af0e0"

RPROVIDES:${PN} += "libheimbase.so.1 \
libheimbase1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
