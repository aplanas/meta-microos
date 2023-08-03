SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install server extras (moto[server])"
LICENSE = "Apache-2.0"

PV = "4.1.13"

RPM_NAME = "python39-moto-server-4.1.13-1.1.noarch.rpm"
RPM_HASH = "ce495b5eacfbe7c27e74b3fbc2e800132bf978b50d53acab801b8bebf3a196f5b9ae63894477efce73d9bab115176b40ca5fa817148fee643ad5321fc90efe6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-moto-server"

RDEPENDS:${PN} += "python39-Flask \
python39-Flask-Cors \
python39-moto-all"

inherit rpm
