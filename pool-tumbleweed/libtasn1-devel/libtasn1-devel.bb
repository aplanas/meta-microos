SUMMARY = "Development files for the ASN.1 parsing library"
DESCRIPTION = "This is the ASN.1 library used by GNUTLS. Abstract Syntax Notation One (ASN.1) \
is a standardized data description and serialization language. \
 \
This package contains files required to build against libtasn1."
LICENSE = "GFDL-1.3-or-later & LGPL-2.1-or-later"

PV = "4.19.0"

RPM_NAME = "libtasn1-devel-4.19.0-1.3.aarch64.rpm"
RPM_HASH = "da78eec71aba64bee05ff7ba5c5e06c2a02b651861c047cfa87df2c6db3796aebd438d752e6d952677f10e3e9131fec3b93f6f21017afa7755666511ce703106"

RPROVIDES:${PN} += "libtasn1-devel \
libtasn1-devel(aarch-64) \
pkgconfig(libtasn1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtasn1-6"

inherit rpm
