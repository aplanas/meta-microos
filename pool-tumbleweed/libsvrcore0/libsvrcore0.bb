SUMMARY = "Secure PIN handling using NSS crypto"
DESCRIPTION = "svrcore provides applications with several ways to handle secure PIN storage \
e.g. in an application that must be restarted, but needs the PIN to unlock \
the private key and other crypto material, without user intervention.  svrcore \
uses the facilities provided by NSS."
LICENSE = "MPL-2.0"

PV = "2.4.0~git18.37ec5cd"

RPM_NAME = "libsvrcore0-2.4.0~git18.37ec5cd-1.3.aarch64.rpm"
RPM_HASH = "008aeb5551924069275aa45dd620c03bfcd06c48cc7eb8ca5cf9f2a35f6ade094f8e6088d0b7cd58a4d4a531dd708bd87ce7e41c09c4695aeb433bec82ada365"

RPROVIDES:${PN} += "libsvrcore.so.0 \
libsvrcore0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnss3.so"

inherit rpm
