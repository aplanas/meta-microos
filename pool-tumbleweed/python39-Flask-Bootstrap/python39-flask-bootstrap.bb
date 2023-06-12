SUMMARY = "An extension that includes Bootstrap in your project"
DESCRIPTION = "Flask-Bootstrap packages `Bootstrap \
<http://getbootstrap.com>`_ into an extension that mostly consists \
of a blueprint named 'bootstrap'. It can also create links to serve Bootstrap \
from a CDN and works with no boilerplate code in your application."
LICENSE = "BSD-2-Clause & Apache-2.0"

PV = "3.3.7.1"

RPM_NAME = "python39-Flask-Bootstrap-3.3.7.1-1.16.noarch.rpm"
RPM_HASH = "972e196280471e727beaacf660c71c4487de0bb398737ada400b90fbf87dbe0e8d756caa3527cddeb643e18c8b9f7788f72b6c67f1debe67c26434cec0f1aeff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-bootstrap) \
python39-Flask-Bootstrap \
python3dist(flask-bootstrap)"
RDEPENDS:${PN} += "python(abi) \
python39-Flask \
python39-dominate \
python39-visitor"

inherit rpm
