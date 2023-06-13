SUMMARY = "Examples of using dialog tool"
DESCRIPTION = "Examples of using menus and dialog boxes in shell scripts."
LICENSE = "LGPL-2.1-only"

PV = "1.3"

RPM_NAME = "dialog-examples-1.3-9.7.noarch.rpm"
RPM_HASH = "8a04da1cc2845198a94d906b53dda9f08fcd8e7fb4d3709a134a97973a4e426e05677b1e7c5fc0bae0917a5f4f7a454764a0744847bbda28633b98763597be48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dialog-examples"

RDEPENDS:${PN} += "dialog"

inherit rpm
