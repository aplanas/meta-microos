SUMMARY = "Header files for ALSA development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require ALSA."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.9"

RPM_NAME = "alsa-devel-1.2.9-1.1.aarch64.rpm"
RPM_HASH = "5d272b4e353ca3678eb93692b4ffa38856609ce7f233b1be9fd8902688619c739aa4077ddaaa8eaa4ed3ace5c3b2fd1d216f45b3091d5fef1b2c5e985f3d06ce"

RPROVIDES:${PN} += "alsa-devel alsa-devel(aarch-64) alsa-lib-devel alsadev pkgconfig(alsa)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libasound2"

inherit rpm
