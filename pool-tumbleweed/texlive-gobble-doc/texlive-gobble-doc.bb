SUMMARY = "Documentation for texlive-gobble"
DESCRIPTION = "This package includes the documentation for texlive-gobble"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn64967"

RPM_NAME = "texlive-gobble-doc-2023.209.0.0.2svn64967-54.1.noarch.rpm"
RPM_HASH = "a4edecf83184c11222aa4c1083babbe82b52b8d79e6acaeeb320857d1418693e9d142dc00691dcfc9b7caff09163ba215e29ec79e3d6ca78121a60ba0ccfc2a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gobble-doc"

RDEPENDS:${PN} += ""

inherit rpm
