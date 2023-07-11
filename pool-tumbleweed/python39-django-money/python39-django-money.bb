SUMMARY = "Django support for using money and currency fields"
DESCRIPTION = "Django money and currency fields in models and forms."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python39-django-money-3.0-1.5.noarch.rpm"
RPM_HASH = "25e944a121bb3039e836ea5893835b0c89393fecfe524cddd6030cf695da27b06f77a03b949b32c185f8ba8ba24cc4f1583e6bf4465724ebae5e3dca334db4fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-money \
python39-django-money \
python3dist-django-money"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-py-moneyed \
python39-setuptools"

inherit rpm
