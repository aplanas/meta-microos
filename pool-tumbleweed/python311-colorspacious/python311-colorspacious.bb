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

RPM_NAME = "python311-colorspacious-1.1.2-2.9.noarch.rpm"
RPM_HASH = "2cdb3ca7fe8bded88dadaa50a20fff461e0f33332fabe469e039ee029a87909ba003745845186882d4a85c1d9ae8e31f2f95fb37d8a3fe122d9dd867f09eb2ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorspacious \
python3.11dist-colorspacious \
python311-colorspacious \
python3dist-colorspacious"

RDEPENDS:${PN} += "python-abi \
python311-numpy"

inherit rpm
