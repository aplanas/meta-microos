SUMMARY = "Mail Merge Functionality for LibreOffice"
DESCRIPTION = "This module allows you to create form letters or send E-mail messages \
to many recipients using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-mailmerge-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "c8c1b039d33809d53f09482b65248408d8b028bbcf32c60c766415dcd3e37281935235865fe71404a4dde6887b588ad2a572e9157ac481ed9eb56f7e4475ddfe"

RPROVIDES:${PN} += "libreoffice-mailmerge"

RDEPENDS:${PN} += "libreoffice-pyuno"

inherit rpm
