SUMMARY = "RAR Archive Reader for Python (Documentation)"
DESCRIPTION = "Python module for RAR archive reading. \
 \
This package contains technical documentation."
LICENSE = "ISC"

PV = "4.0"

RPM_NAME = "python310-rarfile-doc-4.0-3.7.noarch.rpm"
RPM_HASH = "69f445600c46ee7f8dcddd03a35436082dd43da465ce1d1550ded7eb699cea35dafb5ec8f2ec2a530b6b7b0a531b0a15e828748ea0ab9e3d009fac9f8459168a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-rarfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
