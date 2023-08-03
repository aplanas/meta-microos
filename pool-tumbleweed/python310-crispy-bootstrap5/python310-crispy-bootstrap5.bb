SUMMARY = "Bootstrap5 template pack for django-crispy-forms"
DESCRIPTION = "Bootstrap5 template pack for django-crispy-forms"
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python310-crispy-bootstrap5-0.7-1.1.noarch.rpm"
RPM_HASH = "e132796c73b27eaae4f0cbc57bb9ebc4bd10e798aa6bd41b05369309cddf62fd224cae5088ed8cf273ddd27b7431b65a77d91e687c0424b2a99e1c10f5fc8e98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-crispy-bootstrap5 \
python310-crispy-bootstrap5 \
python3dist-crispy-bootstrap5"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-django-crispy-forms"

inherit rpm
