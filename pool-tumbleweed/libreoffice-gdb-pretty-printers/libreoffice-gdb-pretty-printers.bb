SUMMARY = "Additional support for debugging with gdb"
DESCRIPTION = "This package provides gdb pretty printers for package libreoffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-gdb-pretty-printers-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "6a59937f9a90810156c8d2c7ea6fac3a642362cb39650dd4bc141e33d84d59019f6c5f3fc6ed5820951b3a0c676954cc976f1e251dd922bc0b9c4026190f08dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-gdb-pretty-printers"

RDEPENDS:${PN} += "gdb \
libreoffice \
python3-six"

inherit rpm
