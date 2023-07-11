SUMMARY = "Python multiple screenshots module"
DESCRIPTION = "An ultra fast cross-platform multiple screenshots module in pure Python using ctypes."
LICENSE = "MIT"

PV = "7.0.1"

RPM_NAME = "python39-mss-7.0.1-1.6.noarch.rpm"
RPM_HASH = "f0c3ea9bee4d1329f7cd7943f6932fc473fad97426a10930dee4bfafdd24653fef3ad433f02d5a82b3c600086710901845802cc4d1eb3322f01c7b1c917f70a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mss \
python39-mss \
python3dist-mss"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives \
xrandr"

inherit rpm
