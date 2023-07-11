SUMMARY = "Tools for working with pandas in Django projects"
DESCRIPTION = "Tools for working with pandas in Django projects."
LICENSE = "BSD-3-Clause"

PV = "0.6.6"

RPM_NAME = "python311-django-pandas-0.6.6-2.6.noarch.rpm"
RPM_HASH = "dcaeb3579f059300634726ba6cca0219a8420c89b1fb95bc5407b4e4eb0baef2ab06b53aba9baf08810075efe69b9772f160f2c29dff1cecb7878acd9bf2c483"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-pandas \
python3.11dist-django-pandas \
python311-django-pandas \
python3dist-django-pandas"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-pandas"

inherit rpm
