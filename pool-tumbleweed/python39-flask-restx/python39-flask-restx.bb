SUMMARY = "Framework for fast, easy and documented API development with Flask"
DESCRIPTION = "Flask-RESTX is a community driven fork of Flask-RESTPlus. It is an extension for Flask \
that adds support for quickly building REST APIs. It encourages best practices with \
minimal setup. If you are familiar with Flask, Flask-RESTX should be easy to pick up. \
It provides a coherent collection of decorators and tools to describe your API and expose \
its documentation properly using Swagger."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python39-flask-restx-0.5.1-5.6.noarch.rpm"
RPM_HASH = "9b0c323c155454a9f4de3736542f4a6d20409085825ea7c8a952420dcda45dfe274f7c758b75fc74be3e95158b5af1d71216d5b60ccee1d3aad3ff27f76115fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-restx \
python39-flask-restx \
python3dist-flask-restx"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-aniso8601 \
python39-jsonschema \
python39-pytz"

inherit rpm
