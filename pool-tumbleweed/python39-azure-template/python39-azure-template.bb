SUMMARY = "Microsoft Azure Template Package Client Library for Python"
DESCRIPTION = "This template package matches necessary patterns that the development team has established to \
create a unified sdk functional from Python 2.7 onwards. The packages contained herein can be \
installed singly or as part of the azure namespace. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "0.1.0b2675288"

RPM_NAME = "python39-azure-template-0.1.0b2675288-1.1.noarch.rpm"
RPM_HASH = "b7b47def81ff1eb2797c1619b87351fb756422b402147baa3665ce39dc5e8ed6fa64b4828bb282babd75517bbaaa3a529cb46808d8522baec826734888c40b15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-template) \
python39-azure-template \
python3dist(azure-template)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-core"

inherit rpm
