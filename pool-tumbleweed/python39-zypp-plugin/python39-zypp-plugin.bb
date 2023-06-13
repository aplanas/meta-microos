SUMMARY = "Helper that makes writing ZYpp plugins easier"
DESCRIPTION = "This API allows writing ZYpp plugins by just subclassing from a python class \
and implementing the commands you want to respond to as python methods."
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "python39-zypp-plugin-0.6.3-4.21.noarch.rpm"
RPM_HASH = "de69a1f5655d79d2b454f71f7e050aa0375f81666cbaa829d3b280b6bb5ca14b85d9561c33f661ce11997637693cef4ee3cb4f4f59b71fa8799deefb1a8b39eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-zypp-plugin"

RDEPENDS:${PN} += "python(abi) \
python39-base"

inherit rpm
