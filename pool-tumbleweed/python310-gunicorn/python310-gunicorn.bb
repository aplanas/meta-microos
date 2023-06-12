SUMMARY = "WSGI HTTP Server for UNIX"
DESCRIPTION = "Gunicorn 'Green Unicorn' is a Python WSGI HTTP Server for UNIX. It's a pre-fork \
worker model ported from Ruby's Unicorn_ project. The Gunicorn server is broadly \
compatible with various web frameworks."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python310-gunicorn-20.1.0-4.1.noarch.rpm"
RPM_HASH = "5835896b68804a3a56a2c500ec8d222083cdfd2bb81efd0ec78a05e39c9ae4d3f7980bbf89e0cd6f6624b50463ae38a21a75ce1e4c713732cda78908c3ad52aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gunicorn \
python3.10dist(gunicorn) \
python310-gunicorn \
python3dist(gunicorn)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-setuptools \
update-alternatives"

inherit rpm
