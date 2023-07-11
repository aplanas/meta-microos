SUMMARY = "Easy thumbnails for Django"
DESCRIPTION = "The powerful, yet easy to implement thumbnailing application for Django."
LICENSE = "BSD-2-Clause"

PV = "2.8.5"

RPM_NAME = "python310-easy-thumbnails-2.8.5-1.6.noarch.rpm"
RPM_HASH = "fe2d93255e544b8257db6af0fa5c123df8b9c66a1fe3bac60260af24a42f066f68dd252f3e6d50949367403b0c0cefc4f2c8b1e44c02f3f381877ebbd45b299b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-easy-thumbnails \
python310-easy-thumbnails \
python3dist-easy-thumbnails"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-Pillow \
python310-lxml \
python310-reportlab \
python310-svglib"

inherit rpm
