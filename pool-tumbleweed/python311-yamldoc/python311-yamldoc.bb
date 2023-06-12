SUMMARY = "A module to determine file mimetypes"
DESCRIPTION = "This module is a layer on top of the standard Python mimetypes module and \
python-magic. Python-magic only works with local files to which you need to \
have access, while mimetypes only uses the filename to determine its \
filetype."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "python311-yamldoc-0.3.0-1.14.noarch.rpm"
RPM_HASH = "89a5ee80fca1ef372c989b585792b086dcd6cf3657b31473ca850ab742c13b662c848e3a93e13a0edd85b2f117ccdb743167b082ef7c2b7def913062d2d4bf93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-yamldoc) \
python311-yamldoc \
python3dist(python-yamldoc)"
RDEPENDS:${PN} += "python(abi) \
python311-PyYAML"

inherit rpm
