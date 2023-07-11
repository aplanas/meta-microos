SUMMARY = "Python multiple screenshots module"
DESCRIPTION = "An ultra fast cross-platform multiple screenshots module in pure Python using ctypes."
LICENSE = "MIT"

PV = "7.0.1"

RPM_NAME = "python310-mss-7.0.1-1.6.noarch.rpm"
RPM_HASH = "88171f57863555016d5da7967306a12798c44f3c524764ee380e4c711938e0df21f5685397b9d2d5f0fdf52fc841c8b9e1a35ddcb88c6e214fa38a0d49152f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mss \
python310-mss \
python3dist-mss"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives \
xrandr"

inherit rpm
