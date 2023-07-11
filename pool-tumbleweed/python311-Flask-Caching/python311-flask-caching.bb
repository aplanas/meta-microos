SUMMARY = "Adds caching support to your Flask application"
DESCRIPTION = "Adds caching support to your Flask application. Continuation of the Flask-Cache \
Extension."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "python311-Flask-Caching-1.9.0-1.14.noarch.rpm"
RPM_HASH = "257e1385610fb5090ec5b48d724d75fbcb7d92a4102c87338e78e70d32184e44ec29c657d1b0a1eda20fdddd256902aaa2762ba74bee2d38921972754685fc9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Caching \
python3.11dist-flask-caching \
python311-Flask-Caching \
python3dist-flask-caching"

RDEPENDS:${PN} += "python-abi \
python311-Flask"

inherit rpm
