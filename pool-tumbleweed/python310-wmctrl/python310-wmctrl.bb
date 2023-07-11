SUMMARY = "Python programmatic control of X windows"
DESCRIPTION = "Python tool to programmatically control windows inside X."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python310-wmctrl-0.4-2.4.noarch.rpm"
RPM_HASH = "ae5da9d95b6fc359822109be770e50065790b4599dc1876c65f8eafbc495347c7ef13e9fb6a3ac18c27c0113b99fffb3bde0d568dcba635e8fd16af176c4e60e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wmctrl \
python310-wmctrl \
python3dist-wmctrl"

RDEPENDS:${PN} += "python-abi \
wmctrl \
xorg-x11-server"

inherit rpm
