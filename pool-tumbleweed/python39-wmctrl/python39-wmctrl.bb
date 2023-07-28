SUMMARY = "Python programmatic control of X windows"
DESCRIPTION = "Python tool to programmatically control windows inside X."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python39-wmctrl-0.4-2.5.noarch.rpm"
RPM_HASH = "a488a25991d6b509be7dddb76bdaf13884e0d3cff61695dbf691040c888f64cb8f304153bca357a7f8f2637b8c52f36a89499e175d17b384d237da02ca92ade7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wmctrl \
python39-wmctrl \
python3dist-wmctrl"

RDEPENDS:${PN} += "python-abi \
wmctrl \
xorg-x11-server"

inherit rpm
