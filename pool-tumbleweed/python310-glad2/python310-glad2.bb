SUMMARY = "Multi-Language GL/GLES/EGL/GLX/WGL Loader-Generator"
DESCRIPTION = "Multi-Language GL/GLES/EGL/GLX/WGL Loader-Generator based on the official specifications."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-glad2-2.0.1-2.2.noarch.rpm"
RPM_HASH = "3a1f761443f2ceb6cd5d94395e23a574b0744b65efbc53e1363e0564ba7a5a4498709a06ee902d2d851eae9c7f8c5b3ad34d5027e1c410be3bab340ee98b9128"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glad2 \
python3.10dist-glad2 \
python310-glad2 \
python3dist-glad2"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
/usr/sbin/update-alternatives \
python-abi \
python310-Jinja2 \
python310-setuptools"

inherit rpm
