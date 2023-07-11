SUMMARY = "ASN.1 implementation from Heimdal Kerberos"
DESCRIPTION = "This package contains the ASN.1 parser required for Heimdal."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libasn1-8-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "65e7efec75c1606cff6db13c1aa5e08738710fd22cb8d75c0e0a59edb8a70b07d88d333ce5c530bbf34860d70cc8c7f8a8498e87f345de8928cfa67cefa1f0f0"

RPROVIDES:${PN} += "libasn1-8 \
libasn1.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libroken.so.18"

inherit rpm
