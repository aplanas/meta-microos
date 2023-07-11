SUMMARY = "Documentation for python-gunicorn"
DESCRIPTION = "Gunicorn 'Green Unicorn' is a Python WSGI HTTP Server for UNIX. It's a pre-fork \
worker model ported from Ruby's Unicorn_ project. The Gunicorn server is broadly \
compatible with various web frameworks. \
 \
This package contains the documentation."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python-gunicorn-doc-20.1.0-4.2.noarch.rpm"
RPM_HASH = "114310108747640c16d90f8a2241df996bf2a8080cc68f78fe4af904194f53fe0ac4731b6c902cb92e4e1f63898baabb7812a49c2930bd9fb4ee027d79dec9df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-gunicorn-doc \
python310-gunicorn-doc \
python311-gunicorn-doc \
python39-gunicorn-doc"

RDEPENDS:${PN} += ""

inherit rpm
