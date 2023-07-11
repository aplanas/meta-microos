SUMMARY = "An extension that includes Bootstrap in your project"
DESCRIPTION = "Flask-Bootstrap packages `Bootstrap \
<http://getbootstrap.com>`_ into an extension that mostly consists \
of a blueprint named 'bootstrap'. It can also create links to serve Bootstrap \
from a CDN and works with no boilerplate code in your application."
LICENSE = "BSD-2-Clause & Apache-2.0"

PV = "3.3.7.1"

RPM_NAME = "python39-Flask-Bootstrap-3.3.7.1-1.18.noarch.rpm"
RPM_HASH = "0eaf0d1b74ebed1339f676ee9824329abc780f413d8b0a067fc40c144c99a6151cb94d798ad6723357a86a409c1d636a73ccbc3384b483e8d125599f4f9f21ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-bootstrap \
python39-Flask-Bootstrap \
python3dist-flask-bootstrap"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-dominate \
python39-visitor"

inherit rpm
