SUMMARY = "GNU Aspell - Pspell Compatibility Library"
DESCRIPTION = "GNU Aspell is a spell checker planned to eventually replace Ispell. It \
can be used as a library or as an independent spell checker. \
 \
This package contains the pspell compatibility library."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8"

RPM_NAME = "libpspell15-0.60.8-5.4.aarch64.rpm"
RPM_HASH = "bfe78a34c273b9940946bfc581348a51665848b9e7f3f325640169f1364534d1f7aa6e519248b8da8d711241d95c7b2b76cec03c64be371a9dd316b012fb03ec"

RPROVIDES:${PN} += "libpspell.so.15()(64bit) \
libpspell15 \
libpspell15(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
