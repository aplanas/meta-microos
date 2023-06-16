SUMMARY = "A set of OpenType fonts designed for user interfaces"
DESCRIPTION = "A set of serif OpenType fonts designed to complement Source Sans"
LICENSE = "OFL-1.1"

PV = "4.005"

RPM_NAME = "adobe-sourceserif4-fonts-4.005-1.1.noarch.rpm"
RPM_HASH = "2398445aae40daf2daea1c00bf02a8915b2873970ab705dbb3fecece523e92bd68d3d45f51a355da97bd2aeb3100a8e36d496c99caac815b2d256c0aa29458a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourceserif4-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
