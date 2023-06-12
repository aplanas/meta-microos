SUMMARY = "RAR Archive Reader for Python (Documentation)"
DESCRIPTION = "Python module for RAR archive reading. \
 \
This package contains technical documentation."
LICENSE = "ISC"

PV = "4.0"

RPM_NAME = "python311-rarfile-doc-4.0-3.5.noarch.rpm"
RPM_HASH = "0bc318e8d677a3646b8d4ca8aeecc01d61f2a2b770eed01230ca142e308e38e9e819c766132c12f7de86535a0865da66c9b50c7c8d620c26d292530765184ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-rarfile-doc"
RDEPENDS:${PN} += ""

inherit rpm
