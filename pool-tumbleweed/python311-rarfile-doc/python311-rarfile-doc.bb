SUMMARY = "RAR Archive Reader for Python (Documentation)"
DESCRIPTION = "Python module for RAR archive reading. \
 \
This package contains technical documentation."
LICENSE = "ISC"

PV = "4.0"

RPM_NAME = "python311-rarfile-doc-4.0-3.7.noarch.rpm"
RPM_HASH = "e6e06df4955056ddc37b9af208e214fe501c6ddabc2732e5812e4ae2588facb487cd7f4af0b7ec18274614f1edb692de391dc639eb0402600c78d80b4bcdfec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rarfile-doc \
python311-rarfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
