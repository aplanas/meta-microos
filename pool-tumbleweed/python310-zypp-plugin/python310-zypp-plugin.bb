SUMMARY = "Helper that makes writing ZYpp plugins easier"
DESCRIPTION = "This API allows writing ZYpp plugins by just subclassing from a python class \
and implementing the commands you want to respond to as python methods."
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "python310-zypp-plugin-0.6.3-4.23.noarch.rpm"
RPM_HASH = "d2a13ac8e1ce12d30a51f05e9c257ae28746f24470f2dec4c78f6d99e2c2948327a39565ffe2be30c291e001aa623c0184d5095194ea19518b58f12006f4b486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-zypp-plugin"

RDEPENDS:${PN} += "python-abi \
python310-base"

inherit rpm
