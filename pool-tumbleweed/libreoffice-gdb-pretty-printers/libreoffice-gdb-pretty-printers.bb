SUMMARY = "Additional support for debugging with gdb"
DESCRIPTION = "This package provides gdb pretty printers for package libreoffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-gdb-pretty-printers-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "9c7d148b1bf5df48bf27d4f8e5ddb1dd53a211e437dde10c54fafce25ab8ce5572ac6d1487e842e175376a53c5695f6e38e433a9744388bf169ab19abe510b3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-gdb-pretty-printers"

RDEPENDS:${PN} += "gdb \
libreoffice \
python3-six"

inherit rpm
