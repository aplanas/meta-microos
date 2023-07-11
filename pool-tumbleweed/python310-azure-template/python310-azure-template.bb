SUMMARY = "Microsoft Azure Template Package Client Library for Python"
DESCRIPTION = "This template package matches necessary patterns that the development team has established to \
create a unified sdk functional from Python 2.7 onwards. The packages contained herein can be \
installed singly or as part of the azure namespace. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "0.1.0b2840062"

RPM_NAME = "python310-azure-template-0.1.0b2840062-1.1.noarch.rpm"
RPM_HASH = "03e8de0681014a838e86165abcf48a359ddb49497ad10b250c446793f9e6387713c6ddb848c95e2341758f1944365bb95856e4e3a94b938eaf5fe8fc90038aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-template \
python310-azure-template \
python3dist-azure-template"

RDEPENDS:${PN} += "python-abi \
python310-azure-core"

inherit rpm
