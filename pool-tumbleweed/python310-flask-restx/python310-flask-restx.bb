SUMMARY = "Framework for fast, easy and documented API development with Flask"
DESCRIPTION = "Flask-RESTX is a community driven fork of Flask-RESTPlus. It is an extension for Flask \
that adds support for quickly building REST APIs. It encourages best practices with \
minimal setup. If you are familiar with Flask, Flask-RESTX should be easy to pick up. \
It provides a coherent collection of decorators and tools to describe your API and expose \
its documentation properly using Swagger."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python310-flask-restx-0.5.1-5.4.noarch.rpm"
RPM_HASH = "2b4180a0eec36361786af0706c9bedb9a70c476bf18e7cb3a00adc166a7eeed2917f860154dfe925dbca7bf2aa1848caa459c8459ab1f264096defdbf4ef8eb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flask-restx \
python3.10dist-flask-restx \
python310-flask-restx \
python3dist-flask-restx"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-aniso8601 \
python310-jsonschema \
python310-pytz"

inherit rpm
