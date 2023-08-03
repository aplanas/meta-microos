SUMMARY = "Bootstrap4 template pack for django-crispy-forms"
DESCRIPTION = "Bootstrap4 template pack for django-crispy-forms"
LICENSE = "MIT"

PV = "2022.1"

RPM_NAME = "python39-crispy-bootstrap4-2022.1-1.1.noarch.rpm"
RPM_HASH = "16690b98f15f77b5a4c891a1b1922b23f57f1c88090625149e500e48d7376d6f6c44b06e33fb4a7e4493b440eca46f8711b47672e95647445449f631b16bb733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-crispy-bootstrap4 \
python39-crispy-bootstrap4 \
python3dist-crispy-bootstrap4"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-django-crispy-forms"

inherit rpm
