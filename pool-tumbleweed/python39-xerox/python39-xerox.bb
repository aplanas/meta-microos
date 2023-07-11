SUMMARY = "Simple Copy + Paste in Python"
DESCRIPTION = "Python copy and paste library supporting OS X, X11 (Linux, BSD, etc.), and Windows."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-xerox-0.4.1-2.16.noarch.rpm"
RPM_HASH = "0b68209f354f8858d91156ee5faa8b7b603da12f11d75509aaa50687f28267a6cf9c898c9d8e9560a25e69b5480c5fadc220a0731f3534d914a169d9941652b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xerox \
python39-xerox \
python3dist-xerox"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives \
xclip"

inherit rpm
