SUMMARY = "Development files for AMF"
DESCRIPTION = "A lightweight, portable multimedia framework that abstracts away most of the \
platform and API-specific details. AMF is supported on the closed-source \
AMDGPU-Pro driver. \
 \
The AMF-devel package contains header files for developing \
applications that use AMF."
LICENSE = "MIT"

PV = "1.4.26"

RPM_NAME = "AMF-devel-1.4.26-1.2.noarch.rpm"
RPM_HASH = "1ad4d0736569b7c36befa99e7d32ea438a4017cf49fdfa1d39ef8b76ee57940f69606eb21d6308c2fa6c9ce83c00c86a04010dcba4a6586767808fcb1d2752e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "AMF-devel"

RDEPENDS:${PN} += ""

inherit rpm
