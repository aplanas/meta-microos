SUMMARY = "Multi-Language GL/GLES/EGL/GLX/WGL Loader-Generator"
DESCRIPTION = "Multi-Language GL/GLES/EGL/GLX/WGL Loader-Generator based on the official specifications."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-glad2-2.0.1-2.2.noarch.rpm"
RPM_HASH = "a420eb4eb228d3a45480196e2f76551d5255f9c71a468d774a06b425458c135d8ba61a4f8b32b7ac459dc78a572b55b940cb9135518c71b0c6818571cb837571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(glad2) \
python39-glad2 \
python3dist(glad2)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
/usr/sbin/update-alternatives \
python(abi) \
python39-Jinja2 \
python39-setuptools"

inherit rpm
