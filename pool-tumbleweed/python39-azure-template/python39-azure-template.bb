SUMMARY = "Microsoft Azure Template Package Client Library for Python"
DESCRIPTION = "This template package matches necessary patterns that the development team has established to \
create a unified sdk functional from Python 2.7 onwards. The packages contained herein can be \
installed singly or as part of the azure namespace. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "0.1.0b2840062"

RPM_NAME = "python39-azure-template-0.1.0b2840062-1.1.noarch.rpm"
RPM_HASH = "5a60779aace8a0aaf3820279b729f8b4aa92a38acb89ed5689726513d7c04a812ec5b5ba08d14a7fe76c3769cd79b76c556b16823865017f7cfd25a78339ffa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-template \
python39-azure-template \
python3dist-azure-template"

RDEPENDS:${PN} += "python-abi \
python39-azure-core"

inherit rpm
