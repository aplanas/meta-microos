SUMMARY = "Python programmatic control of X windows"
DESCRIPTION = "Python tool to programmatically control windows inside X."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python310-wmctrl-0.4-2.5.noarch.rpm"
RPM_HASH = "1fb778ff93dc85a000207f33aa35ec7ec3669f74d555583c1f8126d95afe50f99f7818c7ca9b0cf21d94a1513b5dfd4e68ed9498d131d48eca013bd42a6835b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wmctrl \
python310-wmctrl \
python3dist-wmctrl"

RDEPENDS:${PN} += "python-abi \
wmctrl \
xorg-x11-server"

inherit rpm
