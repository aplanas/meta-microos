SUMMARY = "An extension that includes Bootstrap in your project"
DESCRIPTION = "Flask-Bootstrap packages `Bootstrap \
<http://getbootstrap.com>`_ into an extension that mostly consists \
of a blueprint named 'bootstrap'. It can also create links to serve Bootstrap \
from a CDN and works with no boilerplate code in your application."
LICENSE = "BSD-2-Clause & Apache-2.0"

PV = "3.3.7.1"

RPM_NAME = "python310-Flask-Bootstrap-3.3.7.1-1.18.noarch.rpm"
RPM_HASH = "f48b0faf161b51284fa19ad97ee6bff7da4aa87ce7e685db6de55a290952b527f22a89042525330672d40b0dbfc8c75221d54736d2dc14755ffbcae07ea02765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-bootstrap \
python310-Flask-Bootstrap \
python3dist-flask-bootstrap"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-dominate \
python310-visitor"

inherit rpm
