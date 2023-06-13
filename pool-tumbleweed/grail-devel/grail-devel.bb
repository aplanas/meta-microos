SUMMARY = "Development files for gesture recognition library"
DESCRIPTION = "Development files for the gesture recognition library (grail). \
The library handles tentative getures, i.e., buffering of events \
for several alternative gestures until a match is confirmed."
LICENSE = "LGPL-3.0 & GPL-3.0"

PV = "3.1.1"

RPM_NAME = "grail-devel-3.1.1-1.22.aarch64.rpm"
RPM_HASH = "aacd5c8b71128998e89b64e677edaaf1430227ec8fc538c6adc666f16ee79bf8a671029aa6b87a6491ac9be7c96309a52730a438282881979efd77339cc5d6c6"

RPROVIDES:${PN} += "grail-devel \
grail-devel(aarch-64) \
pkgconfig(grail)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
grail \
libgrail6"

inherit rpm
