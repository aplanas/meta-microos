SUMMARY = "Helper that makes writing ZYpp plugins easier"
DESCRIPTION = "This API allows writing ZYpp plugins by just subclassing from a python class \
and implementing the commands you want to respond to as python methods."
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "python311-zypp-plugin-0.6.3-4.23.noarch.rpm"
RPM_HASH = "9103788da936607e11ddd3bc9bd01ca7ed158011b87dfb96090b349898ad25f13a687ff76bb53a1b9fdf91f01d6c48f2cc3e36c88d59a834b30a737655966df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zypp-plugin \
python311-zypp-plugin"

RDEPENDS:${PN} += "python-abi \
python311-base"

inherit rpm
