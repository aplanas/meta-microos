SUMMARY = "Multi-Language GL/GLES/EGL/GLX/WGL Loader-Generator"
DESCRIPTION = "Multi-Language GL/GLES/EGL/GLX/WGL Loader-Generator based on the official specifications."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-glad2-2.0.1-2.4.noarch.rpm"
RPM_HASH = "93f83e70f7d8615a76be6618158e1167f657d3db34e6240ee781e90326219b68f4fee27b0bdc9bc4ba307730bd7532b60497fcec034420b2b36561915b330a06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-glad2 \
python310-glad2 \
python3dist-glad2"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
/usr/sbin/update-alternatives \
python-abi \
python310-Jinja2 \
python310-setuptools"

inherit rpm
