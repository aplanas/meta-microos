SUMMARY = "Framework for fast, easy and documented API development with Flask"
DESCRIPTION = "Flask-RESTX is a community driven fork of Flask-RESTPlus. It is an extension for Flask \
that adds support for quickly building REST APIs. It encourages best practices with \
minimal setup. If you are familiar with Flask, Flask-RESTX should be easy to pick up. \
It provides a coherent collection of decorators and tools to describe your API and expose \
its documentation properly using Swagger."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python310-flask-restx-0.5.1-5.6.noarch.rpm"
RPM_HASH = "216daa4ccbf28edb4729f114252290d99c4b787499540b8368c74f6d9a2308c79fe6e27b41126c9472d522ee365e70b04cce771ef0eee93df38eb2827cff0908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-restx \
python310-flask-restx \
python3dist-flask-restx"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-aniso8601 \
python310-jsonschema \
python310-pytz"

inherit rpm
