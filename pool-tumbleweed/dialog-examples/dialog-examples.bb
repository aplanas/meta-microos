SUMMARY = "Examples of using dialog tool"
DESCRIPTION = "Examples of using menus and dialog boxes in shell scripts."
LICENSE = "LGPL-2.1-only"

PV = "1.3"

RPM_NAME = "dialog-examples-1.3-10.1.noarch.rpm"
RPM_HASH = "255311e4d9878d1f76ed070e7c2ac4e2c4884f3f856007277bcae1854025bbf902401e176c1341e2fee4077bb2ede644beb5cfa74f50b46e52d3599a360c22b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dialog-examples"

RDEPENDS:${PN} += "dialog"

inherit rpm
