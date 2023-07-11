SUMMARY = "Helper that makes writing ZYpp plugins easier"
DESCRIPTION = "This API allows writing ZYpp plugins by just subclassing from a python class \
and implementing the commands you want to respond to as python methods."
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "python39-zypp-plugin-0.6.3-4.23.noarch.rpm"
RPM_HASH = "a1348de3e7bdbcfcdc4c8e60b2d39a92755263bd3e020b51b260c4daed857747f65f4286f661db3119f29fc08a6ee666638ebe692761df0c9982e435a03a4124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-zypp-plugin"

RDEPENDS:${PN} += "python-abi \
python39-base"

inherit rpm
