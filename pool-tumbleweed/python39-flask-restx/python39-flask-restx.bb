SUMMARY = "Framework for fast, easy and documented API development with Flask"
DESCRIPTION = "Flask-RESTX is a community driven fork of Flask-RESTPlus. It is an extension for Flask \
that adds support for quickly building REST APIs. It encourages best practices with \
minimal setup. If you are familiar with Flask, Flask-RESTX should be easy to pick up. \
It provides a coherent collection of decorators and tools to describe your API and expose \
its documentation properly using Swagger."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python39-flask-restx-0.5.1-5.4.noarch.rpm"
RPM_HASH = "5141d8cfe879c1c112ceaa026b54da0156c6d1739043ac04b8f9c546c9c518dc4b028d9343285c88deb36bd0e6f43ea137bef114ca15c5f0aaea5c062c15dfb5"
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
