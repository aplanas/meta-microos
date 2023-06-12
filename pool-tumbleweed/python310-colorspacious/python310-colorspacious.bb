SUMMARY = "Python library for doing colorspace conversions"
DESCRIPTION = "Colorspacious is a library for performing colorspace conversions. \
 \
In addition to the most common standard colorspaces (sRGB, XYZ, xyY, \
CIELab, CIELCh), it also includes color vision deficiency ('color \
blindness') simulations using the approach of Machado et al (2009), a \
complete implementation of CIECAM02 \
<https://en.wikipedia.org/wiki/CIECAM02>, and the perceptually \
uniform CAM02-UCS / CAM02-LCD / CAM02-SCD spaces proposed by Luo et al \
(2006)."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python310-colorspacious-1.1.2-2.7.noarch.rpm"
RPM_HASH = "3b7a81b6ae0b8ad42c5a4db8c30d436946310ea8abf8d292b03308a8b75df267d304b918de68b5fd9390e3557801ff002dd5a989e4efd735a0ccfbf1c3b1583c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorspacious \
python3.10dist(colorspacious) \
python310-colorspacious \
python3dist(colorspacious)"
RDEPENDS:${PN} += "python(abi) \
python310-numpy"

inherit rpm
