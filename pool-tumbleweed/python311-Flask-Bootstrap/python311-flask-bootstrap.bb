SUMMARY = "An extension that includes Bootstrap in your project"
DESCRIPTION = "Flask-Bootstrap packages `Bootstrap \
<http://getbootstrap.com>`_ into an extension that mostly consists \
of a blueprint named 'bootstrap'. It can also create links to serve Bootstrap \
from a CDN and works with no boilerplate code in your application."
LICENSE = "BSD-2-Clause & Apache-2.0"

PV = "3.3.7.1"

RPM_NAME = "python311-Flask-Bootstrap-3.3.7.1-1.18.noarch.rpm"
RPM_HASH = "81c3d64973e81e34b637746de652b6aee48c508c4aad1f6cd32dac65eba2c167e5ec5f3ffb133134d969e768cf1db1031799adc99b043010f88b9211371528e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Bootstrap \
python3.11dist-flask-bootstrap \
python311-Flask-Bootstrap \
python3dist-flask-bootstrap"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-dominate \
python311-visitor"

inherit rpm
