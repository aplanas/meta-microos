SUMMARY = "Documentation for gitslave"
DESCRIPTION = "This package provides documentation and help files for gitslave."
LICENSE = "SUSE-Gitslave"

PV = "2.0.2"

RPM_NAME = "gitslave-doc-2.0.2-9.18.noarch.rpm"
RPM_HASH = "aefb9747ec93186b44567ca705c8d2229aa1ba5ead311b0fcaaae0a449acdf2babf498abc33aa63adb14763c2da5d671b51c15af8389a171cab700c4166deb38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gitslave-doc"

RDEPENDS:${PN} += ""

inherit rpm
