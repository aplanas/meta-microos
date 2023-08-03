SUMMARY = "Framework for fast, easy and documented API development with Flask"
DESCRIPTION = "Flask-RESTX is a community driven fork of Flask-RESTPlus. It is an extension for Flask \
that adds support for quickly building REST APIs. It encourages best practices with \
minimal setup. If you are familiar with Flask, Flask-RESTX should be easy to pick up. \
It provides a coherent collection of decorators and tools to describe your API and expose \
its documentation properly using Swagger."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-flask-restx-1.1.0-1.1.noarch.rpm"
RPM_HASH = "e3540ee2f6df9049541e5e77e4033b5484d809fd43c99b01ab5baeb8c23b724e8e57bfe9e6d5972487fd57f2c16bd5deb76affbdaca05d6c29bbe62af7669951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flask-restx \
python3.11dist-flask-restx \
python311-flask-restx \
python3dist-flask-restx"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-Werkzeug \
python311-aniso8601 \
python311-jsonschema \
python311-pytz"

inherit rpm
