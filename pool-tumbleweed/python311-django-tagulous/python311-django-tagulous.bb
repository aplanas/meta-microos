SUMMARY = "Fabulous Tagging for Django"
DESCRIPTION = "Fabulous Tagging for Django."
LICENSE = "BSD-3-Clause"

PV = "1.3.3"

RPM_NAME = "python311-django-tagulous-1.3.3-1.7.noarch.rpm"
RPM_HASH = "de1366c9864149e3fb7c1488f1c084850301df5a32c29cf7fac5eb0aff43ed5e6f3c312a59a203082e1050d4abbf4ae2e4f013e84a2b01705bf8d484adccefa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-tagulous \
python3.11dist-django-tagulous \
python311-django-tagulous \
python3dist-django-tagulous"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
