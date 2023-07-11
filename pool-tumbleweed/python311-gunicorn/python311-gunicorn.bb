SUMMARY = "WSGI HTTP Server for UNIX"
DESCRIPTION = "Gunicorn 'Green Unicorn' is a Python WSGI HTTP Server for UNIX. It's a pre-fork \
worker model ported from Ruby's Unicorn_ project. The Gunicorn server is broadly \
compatible with various web frameworks."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python311-gunicorn-20.1.0-4.2.noarch.rpm"
RPM_HASH = "ff0475805b66e3c56084f1f394695359f5d0b102ab5c76be3024eb75aa76ccc5a1a4d98e209fe47b7ab5c91a53be66a36bef344358f38529abb8f8cafcd0117a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gunicorn \
python3.11dist-gunicorn \
python311-gunicorn \
python3dist-gunicorn"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
