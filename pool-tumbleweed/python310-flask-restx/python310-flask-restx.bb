SUMMARY = "Framework for fast, easy and documented API development with Flask"
DESCRIPTION = "Flask-RESTX is a community driven fork of Flask-RESTPlus. It is an extension for Flask \
that adds support for quickly building REST APIs. It encourages best practices with \
minimal setup. If you are familiar with Flask, Flask-RESTX should be easy to pick up. \
It provides a coherent collection of decorators and tools to describe your API and expose \
its documentation properly using Swagger."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-flask-restx-1.1.0-1.1.noarch.rpm"
RPM_HASH = "bb068a3c9a5ce42b0005dac413eba7a1c43deef77db57e915c588c9369ea38fe2a035fa00bd040dda1ca9b175881c00c848677d5971576d89166c962d46bb089"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-restx \
python310-flask-restx \
python3dist-flask-restx"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-Werkzeug \
python310-aniso8601 \
python310-jsonschema \
python310-pytz"

inherit rpm
