SUMMARY = "Documentation for C OpenGL Mathematics"
DESCRIPTION = "This package contains documentation files for cglm."
LICENSE = "MIT"

PV = "0.8.9"

RPM_NAME = "cglm-devel-doc-0.8.9-1.3.noarch.rpm"
RPM_HASH = "855b274ab93da5f080f9aa7f23cbbbb965fbdf55e70df9a0450ac0e1c25537a43b925c9ea7fc702a3a078717c70398a3de40d651ebf5170ff519ad739a8e9032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cglm-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
