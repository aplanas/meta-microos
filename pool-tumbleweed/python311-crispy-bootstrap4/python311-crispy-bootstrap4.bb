SUMMARY = "Bootstrap4 template pack for django-crispy-forms"
DESCRIPTION = "Bootstrap4 template pack for django-crispy-forms"
LICENSE = "MIT"

PV = "2022.1"

RPM_NAME = "python311-crispy-bootstrap4-2022.1-1.1.noarch.rpm"
RPM_HASH = "6e783eaebdaf7ba6ca082c7e3b9db575eb6dcba563f887fb5162c146353d37f4a68889e934cd8a7ed76756d56846663725288cbf702a1081024f44e4fd5c60e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crispy-bootstrap4 \
python3.11dist-crispy-bootstrap4 \
python311-crispy-bootstrap4 \
python3dist-crispy-bootstrap4"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-django-crispy-forms"

inherit rpm
