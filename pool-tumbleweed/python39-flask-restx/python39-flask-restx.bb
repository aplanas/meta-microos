SUMMARY = "Framework for fast, easy and documented API development with Flask"
DESCRIPTION = "Flask-RESTX is a community driven fork of Flask-RESTPlus. It is an extension for Flask \
that adds support for quickly building REST APIs. It encourages best practices with \
minimal setup. If you are familiar with Flask, Flask-RESTX should be easy to pick up. \
It provides a coherent collection of decorators and tools to describe your API and expose \
its documentation properly using Swagger."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-flask-restx-1.1.0-1.1.noarch.rpm"
RPM_HASH = "1bd3ebe33351ea2c343572c16f88af59f62cd569c8ef15a91cefc9ecb0c1f49c2712e067fc17cad0f4c3a3e71556001e6b085bfd1425b7fb47ab41f4af3eab38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-restx \
python39-flask-restx \
python3dist-flask-restx"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-Werkzeug \
python39-aniso8601 \
python39-jsonschema \
python39-pytz"

inherit rpm
