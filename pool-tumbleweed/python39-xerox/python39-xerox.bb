SUMMARY = "Simple Copy + Paste in Python"
DESCRIPTION = "Python copy and paste library supporting OS X, X11 (Linux, BSD, etc.), and Windows."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-xerox-0.4.1-2.14.noarch.rpm"
RPM_HASH = "4fd1a49c0d8b51b5215cb5ea5ce2cfb650f12e3dc1a4cada3164c9db68ad274ac42abd622e28c54782a2b62154a10cc30a5a7eb4e298bf8db8659e23bb236fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xerox) \
python39-xerox \
python3dist(xerox)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives \
xclip"

inherit rpm
