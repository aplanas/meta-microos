SUMMARY = "Multi-Language GL/GLES/EGL/GLX/WGL Loader-Generator"
DESCRIPTION = "Multi-Language GL/GLES/EGL/GLX/WGL Loader-Generator based on the official specifications."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-glad2-2.0.1-2.4.noarch.rpm"
RPM_HASH = "d6099cd67870c1d39d153923b226a6b2c17db15cabbf85cb55213bde2bf0f2db3ef56d1ba24789d255aaab5cc01453f739e3978f2ff350def9eb53548b198654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-glad2 \
python39-glad2 \
python3dist-glad2"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
/usr/sbin/update-alternatives \
python-abi \
python39-Jinja2 \
python39-setuptools"

inherit rpm
