SUMMARY = "WSGI HTTP Server for UNIX"
DESCRIPTION = "Gunicorn 'Green Unicorn' is a Python WSGI HTTP Server for UNIX. It's a pre-fork \
worker model ported from Ruby's Unicorn_ project. The Gunicorn server is broadly \
compatible with various web frameworks."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python311-gunicorn-20.1.0-4.1.noarch.rpm"
RPM_HASH = "46e6b2009828620a07e35e1cf250633365eaff8d858447a9a4ca67d41540c782d82939dfcc092bf6b629219331ea434afb30659d6921493c3225cb0f6388677c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-gunicorn \
python311-gunicorn \
python3dist-gunicorn"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
