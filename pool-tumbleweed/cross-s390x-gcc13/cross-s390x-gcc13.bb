SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-s390x-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "29e7e02a86c31fbe02de1514939223fe68a82a35e0c72c399de2a4c6be5429c01644d154a56536e3ecdb708cda0595f2e2848ff72f5a21c024fa4888faa62dc7"

RPROVIDES:${PN} += "cross-s390x-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-s390x-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
