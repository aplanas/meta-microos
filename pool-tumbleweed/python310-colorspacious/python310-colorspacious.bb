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

RPM_NAME = "python310-colorspacious-1.1.2-2.9.noarch.rpm"
RPM_HASH = "b33f7f20efe740474fa5372922bd42191e05147eb4dc4fe21b058f5bd7cdd530ea0c512a02817ec3aceddb026221181065e0dc5c3841f9dabdff1269b14609bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-colorspacious \
python310-colorspacious \
python3dist-colorspacious"

RDEPENDS:${PN} += "python-abi \
python310-numpy"

inherit rpm
