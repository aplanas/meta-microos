SUMMARY = "Helper that makes writing ZYpp plugins easier"
DESCRIPTION = "This API allows writing ZYpp plugins by just subclassing from a python class \
and implementing the commands you want to respond to as python methods."
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "python310-zypp-plugin-0.6.3-4.21.noarch.rpm"
RPM_HASH = "d1d65d7380690c4fd0baaefba120ba3a0451af706aee701d03a8daf81d3085e31613c56926928cd2da3bd4daaa8402e68d1f3f032fee24ae3e721404d9eb850a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zypp-plugin \
python310-zypp-plugin"
RDEPENDS:${PN} += "python(abi) \
python310-base"

inherit rpm
