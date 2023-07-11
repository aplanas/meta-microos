SUMMARY = "Python programmatic control of X windows"
DESCRIPTION = "Python tool to programmatically control windows inside X."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python311-wmctrl-0.4-2.4.noarch.rpm"
RPM_HASH = "32b4fdca90ca8bb51cf287a0905509270589c0b99a2d0c4d40e426598729ec7d143e16c54fe47025f60442970dfc093c9645871e9badf899296c6a88679e47a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wmctrl \
python3.11dist-wmctrl \
python311-wmctrl \
python3dist-wmctrl"

RDEPENDS:${PN} += "python-abi \
wmctrl \
xorg-x11-server"

inherit rpm
