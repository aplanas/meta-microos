SUMMARY = "Multi-Language GL/GLES/EGL/GLX/WGL Loader-Generator"
DESCRIPTION = "Multi-Language GL/GLES/EGL/GLX/WGL Loader-Generator based on the official specifications."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-glad2-2.0.1-2.4.noarch.rpm"
RPM_HASH = "10fa154293b161a7beecdffdb4ca5808510779bfd10a3a9c90fb812bc38977b2a9835a1d91cd7c8fd8088c82bc86073b697846a45d926895b7049dcecb4a2d80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glad2 \
python3.11dist-glad2 \
python311-glad2 \
python3dist-glad2"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
/usr/sbin/update-alternatives \
python-abi \
python311-Jinja2 \
python311-setuptools"

inherit rpm
