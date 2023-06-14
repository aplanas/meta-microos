SUMMARY = "WSGI HTTP Server for UNIX"
DESCRIPTION = "Gunicorn 'Green Unicorn' is a Python WSGI HTTP Server for UNIX. It's a pre-fork \
worker model ported from Ruby's Unicorn_ project. The Gunicorn server is broadly \
compatible with various web frameworks."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python39-gunicorn-20.1.0-4.1.noarch.rpm"
RPM_HASH = "2ed3c8b819a6ff976cc0ecc7be9b6835db83b476b909674f64ef9f5b05497db68f8c98932600080f7a1416affd287bbb20e1dc3a5a0c8802444eaf57563fc4eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gunicorn \
python39-gunicorn \
python3dist-gunicorn"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
