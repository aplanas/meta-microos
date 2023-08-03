SUMMARY = "Bootstrap3 template pack for django-crispy-forms"
DESCRIPTION = "Bootstrap3 template pack for django-crispy-forms"
LICENSE = "MIT"

PV = "2022.1"

RPM_NAME = "python39-crispy-bootstrap3-2022.1-1.1.noarch.rpm"
RPM_HASH = "5c4108bcb285b10ec3357f216c931a77d88a3a09c579a0f6be14f18cebab42744f15300bcec7c958fbe8121f4fc50545b27776e7b70ef8510b7957a501e45242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-crispy-bootstrap3 \
python39-crispy-bootstrap3 \
python3dist-crispy-bootstrap3"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-django-crispy-forms"

inherit rpm
