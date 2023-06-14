SUMMARY = "Header files for the Emu10k1 patch loader"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.8p1"

RPM_NAME = "ld10k1-devel-0.1.8p1-24.3.aarch64.rpm"
RPM_HASH = "742a544949962e08bf1b7643209632e4d454dad1e95e3fa958c21d47b38b4617daede77265265371b5b9cc0d6bc947ec4c4f8feb37cf50a1e8d4810b31695ed8"

RPROVIDES:${PN} += "alsa-tools-devel \
ld10k1-devel"

RDEPENDS:${PN} += "liblo10k1-0"

inherit rpm
