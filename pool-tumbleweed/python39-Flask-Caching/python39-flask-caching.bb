SUMMARY = "Adds caching support to your Flask application"
DESCRIPTION = "Adds caching support to your Flask application. Continuation of the Flask-Cache \
Extension."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "python39-Flask-Caching-1.9.0-1.14.noarch.rpm"
RPM_HASH = "e5804865751251d36b6310a0caf7b019c869aacaff7555852ec37877c2973aba7f8065211267a35b20c74dca67656067ce37cc4e340dff55bc958af035a1c8e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-caching \
python39-Flask-Caching \
python3dist-flask-caching"

RDEPENDS:${PN} += "python-abi \
python39-Flask"

inherit rpm
