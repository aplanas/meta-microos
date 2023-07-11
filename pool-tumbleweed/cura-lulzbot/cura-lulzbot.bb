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

RPM_NAME = "cura-lulzbot-3.6.37-1.6.noarch.rpm"
RPM_HASH = "134837162534e24402af520a93db45e7385e104c479e8fccf3266dcff41a570f9cacf4c9cc54d36397c802ca4345dd5480444f2dfb4b0f496a93f12f244c86dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cura-lulzbot \
cura2-lulzbot"

RDEPENDS:${PN} += "/usr/bin/python3 \
cura-engine-lulzbot \
python-abi \
python3-Arcus \
python3-numpy \
python3-opengl \
python3-power \
python3-pyserial \
python3-qt5 \
python3-scipy \
python3-zeroconf \
uranium-firmware-lulzbot \
uranium-lulzbot"

inherit rpm
