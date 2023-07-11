SUMMARY = "Flask extension providing simple email sending capabilities"
DESCRIPTION = "Flask-Mailman is a Flask extension providing simple email sending capabilities. \
 \
It was meant to replace unmaintained Flask-Mail with a better warranty and \
more features."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python39-Flask-Mailman-0.3.0-2.3.noarch.rpm"
RPM_HASH = "4f9da10ae68599a3975790bbd8b5caed356767b4d88c8fabb4123d71d98dee9f92de20969d306bdad81284b2e1b73175c1932138fc4d75cc3624d8678d7ccc71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-mailman \
python39-Flask-Mailman \
python3dist-flask-mailman"

RDEPENDS:${PN} += "python-abi \
python39-Flask"

inherit rpm
