SUMMARY = "WSGI HTTP Server for UNIX"
DESCRIPTION = "Gunicorn 'Green Unicorn' is a Python WSGI HTTP Server for UNIX. It's a pre-fork \
worker model ported from Ruby's Unicorn_ project. The Gunicorn server is broadly \
compatible with various web frameworks."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python310-gunicorn-20.1.0-4.2.noarch.rpm"
RPM_HASH = "9484d5f1474c374050da0d40a0d4f644e40c343e8dd6d72550084ad305f3f17928940845a5745b508df94432d7d617d689a2da45eedd1eb5731799b55b535dec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gunicorn \
python310-gunicorn \
python3dist-gunicorn"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
