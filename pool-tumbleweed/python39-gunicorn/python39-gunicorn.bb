SUMMARY = "WSGI HTTP Server for UNIX"
DESCRIPTION = "Gunicorn 'Green Unicorn' is a Python WSGI HTTP Server for UNIX. It's a pre-fork \
worker model ported from Ruby's Unicorn_ project. The Gunicorn server is broadly \
compatible with various web frameworks."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python39-gunicorn-20.1.0-4.2.noarch.rpm"
RPM_HASH = "5eec20fcec9dd09984d7dfaa82779c2dc94e385e99d56876a437b2668f84602f1275d8c803bc1b2132e545525d1910f9ff7672b28911fdcd26865d91ccbb8ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gunicorn \
python39-gunicorn \
python3dist-gunicorn"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
