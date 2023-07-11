SUMMARY = "GNU Aspell - Pspell Compatibility Library"
DESCRIPTION = "GNU Aspell is a spell checker planned to eventually replace Ispell. It \
can be used as a library or as an independent spell checker. \
 \
This package contains the pspell compatibility library."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8"

RPM_NAME = "libpspell15-0.60.8-5.5.aarch64.rpm"
RPM_HASH = "7bbbfae117e168dcebba0f0ade5064e4059e5497ec7fc1057755ba80d3d4942dd18971d2481af185ca26ff898707fc03c996a009b21b5eca8deb63aa7a30058d"

RPROVIDES:${PN} += "libpspell.so.15 \
libpspell15"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
