SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply library used by Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply5-22.02.122+94.4bd41a3-10.1.aarch64.rpm"
RPM_HASH = "d301691554f3a09ec90ff688543605329838ab2db6a07593cc1fd3cb1514ca7fa444fcf10eb0a48b1a75bc306dd972cd7d72c8c44fb8858a7c1a5d82280b9768"

RPROVIDES:${PN} += "libply.so.5 \
libply5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
