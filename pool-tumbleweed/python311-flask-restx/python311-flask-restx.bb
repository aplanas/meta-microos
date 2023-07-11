SUMMARY = "Framework for fast, easy and documented API development with Flask"
DESCRIPTION = "Flask-RESTX is a community driven fork of Flask-RESTPlus. It is an extension for Flask \
that adds support for quickly building REST APIs. It encourages best practices with \
minimal setup. If you are familiar with Flask, Flask-RESTX should be easy to pick up. \
It provides a coherent collection of decorators and tools to describe your API and expose \
its documentation properly using Swagger."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python311-flask-restx-0.5.1-5.6.noarch.rpm"
RPM_HASH = "e0a8ba944b0ca694f5712e44e35ae3a6529a023ec9c834586f09bb5a6c29ab9ecf7c400c8507c5f0844848303026f4489b7605c4e2afcc085f09174db5039960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flask-restx \
python3.11dist-flask-restx \
python311-flask-restx \
python3dist-flask-restx"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-aniso8601 \
python311-jsonschema \
python311-pytz"

inherit rpm
