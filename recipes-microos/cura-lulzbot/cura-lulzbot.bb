SUMMARY = "3D printer control software"
DESCRIPTION = "Cura is a software solution for 3D printing. \
While it is developed to be used with the Ultimaker 3D printer, it can be used \
with other RepRap based designs. \
 \
Cura helps in setting up an Ultimaker, shows 3D models, allows for scaling / \
positioning, can slice the model to G-Code, has editable configuration \
settings, and send this G-Code to the 3D printer for printing."
LICENSE = "AGPL-3.0-only"

PV = "3.6.37"

RPM_NAME = "cura-lulzbot-3.6.37-1.5.noarch.rpm"
RPM_HASH = "a4060f0cd246cf0a62da7d6a51c759ef4bf981a75e536dcbcb349b8c273c0bf81d9ac5cf966cd65770e5b29c8f86a097024aa7a62de59bed9a93c55075da2f77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(cura-lulzbot.desktop) cura-lulzbot cura2-lulzbot metainfo() metainfo(cura.appdata.xml) mimehandler(application/prs.wavefront-obj) mimehandler(application/sla) mimehandler(application/vnd.ms-3mfdocument) mimehandler(image/bmp) mimehandler(image/gif) mimehandler(image/jpeg) mimehandler(image/png) mimehandler(model/x3d+xml)"
RDEPENDS:${PN} += "/usr/bin/python3 cura-engine-lulzbot python(abi) python3-Arcus python3-numpy python3-opengl python3-power python3-pyserial python3-qt5 python3-scipy python3-zeroconf uranium-firmware-lulzbot uranium-lulzbot"

inherit rpm
