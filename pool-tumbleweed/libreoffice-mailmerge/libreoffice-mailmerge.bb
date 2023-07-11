SUMMARY = "Mail Merge Functionality for LibreOffice"
DESCRIPTION = "This module allows you to create form letters or send E-mail messages \
to many recipients using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-mailmerge-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "eab4e8266119a765c7992340841b2c64889417249e7fc1620f4c1a9cd3e9a5904f5b339132dac44002b9dbbb2540788ec1138b7db7b3f3ced8607d2dc3553265"

RPROVIDES:${PN} += "libreoffice-mailmerge"

RDEPENDS:${PN} += "libreoffice-pyuno"

inherit rpm
