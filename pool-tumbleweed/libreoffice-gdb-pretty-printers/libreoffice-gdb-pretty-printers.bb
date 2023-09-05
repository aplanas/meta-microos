SUMMARY = "Additional support for debugging with gdb"
DESCRIPTION = "This package provides gdb pretty printers for package libreoffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-gdb-pretty-printers-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "c0a5c87fe7e5b3ec43118def585809f69f5332a17ff4d611dfc89ae0ae2ae9c72aa2e59fa57948df0560c7d1d57d75af755c431d1194b9d131429d50ed1660f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-gdb-pretty-printers"

RDEPENDS:${PN} += "gdb \
libreoffice \
python3-six"

inherit rpm
