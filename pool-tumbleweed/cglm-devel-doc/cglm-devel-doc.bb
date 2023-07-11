SUMMARY = "Documentation for C OpenGL Mathematics"
DESCRIPTION = "This package contains documentation files for cglm."
LICENSE = "MIT"

PV = "0.8.9"

RPM_NAME = "cglm-devel-doc-0.8.9-1.4.noarch.rpm"
RPM_HASH = "2230091c34617ca8a6ddf14b1ef1a3d19ad3777392db0945006bcae7e2693d2321fea9b9c8f8d33d6bd8f5050d6c0a8a40cf2a68c9631816cf1052058720d2e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cglm-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
