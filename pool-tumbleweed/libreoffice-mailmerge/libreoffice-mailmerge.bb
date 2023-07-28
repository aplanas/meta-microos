SUMMARY = "Mail Merge Functionality for LibreOffice"
DESCRIPTION = "This module allows you to create form letters or send E-mail messages \
to many recipients using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-mailmerge-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "b9a7c2cce689f642a79ea1c71062e049f64a0caf015dae88095aa91fdc05c4911f134b5b4d2dd07e8baada7e61d0c9b71070996ef3fdc76e48b411d86299315e"

RPROVIDES:${PN} += "libreoffice-mailmerge"

RDEPENDS:${PN} += "libreoffice-pyuno"

inherit rpm
