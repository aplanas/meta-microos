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

RPM_NAME = "python39-colorspacious-1.1.2-2.9.noarch.rpm"
RPM_HASH = "cdc1ddd5e846a44f4e316db042785fd6aa77a89dcd7cb084205454aac4eacd7fa4fbeebf0fdd835b3f174c934297a30adda5bad1de87ce07c478f9972997d958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-colorspacious \
python39-colorspacious \
python3dist-colorspacious"

RDEPENDS:${PN} += "python-abi \
python39-numpy"

inherit rpm
