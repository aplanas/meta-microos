SUMMARY = "Bootstrap5 template pack for django-crispy-forms"
DESCRIPTION = "Bootstrap5 template pack for django-crispy-forms"
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python39-crispy-bootstrap5-0.7-1.1.noarch.rpm"
RPM_HASH = "b4227359341478cb19c4f1ec551f0e5fff5b0d7442ce19db96cffab77698bc3ebb0eac24ed1c901dab197f485b573526c5c000fb6f79d185a3e1a0e42465c330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-crispy-bootstrap5 \
python39-crispy-bootstrap5 \
python3dist-crispy-bootstrap5"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-django-crispy-forms"

inherit rpm
