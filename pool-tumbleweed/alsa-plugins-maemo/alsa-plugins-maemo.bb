SUMMARY = "Maemo Plug-Ins for ALSA Library"
DESCRIPTION = "This package contains ALSA-library plug-ins using maemo SDK for \
Nokia 770."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-maemo-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "bd5d356f2cf567a7128c98dc87ea3533a17716404f5980c01d571f67488bf6b7b5ede86a405c88512eba526ac7f4e43464bdc6c4b3bbe2d1d7c383c98ef2241c"

RPROVIDES:${PN} += "alsa-plugins-maemo \
libasound-module-ctl-dsp-ctl.so \
libasound-module-pcm-alsa-dsp.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
