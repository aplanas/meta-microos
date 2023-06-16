SUMMARY = "Multi-Language GL/GLES/EGL/GLX/WGL Loader-Generator"
DESCRIPTION = "Multi-Language GL/GLES/EGL/GLX/WGL Loader-Generator based on the official specifications."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-glad2-2.0.1-2.2.noarch.rpm"
RPM_HASH = "6302eac8f92601f9e71fb585ffe4b35dbab0ffd3cf0ce7d6fc0a4a4c947ed3a1980ed43b0b23359eae51a73bc5176ee5567ba5201fc768b911cf8b8ffd94761f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-glad2 \
python311-glad2 \
python3dist-glad2"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
/usr/sbin/update-alternatives \
python-abi \
python311-Jinja2 \
python311-setuptools"

inherit rpm
