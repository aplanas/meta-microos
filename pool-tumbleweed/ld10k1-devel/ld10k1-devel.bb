SUMMARY = "Header files for the Emu10k1 patch loader"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.8p1"

RPM_NAME = "ld10k1-devel-0.1.8p1-24.4.aarch64.rpm"
RPM_HASH = "4e9ac81a245f14f68b9509b4b442b75a9a5bf0cbe1c1c195a70f78251566476d5fc8b3308494dea34b0d6e07bc2ab8511d0e4108783e4f92619f07734a16b63e"

RPROVIDES:${PN} += "alsa-tools-devel \
ld10k1-devel"

RDEPENDS:${PN} += "liblo10k1-0"

inherit rpm
