SUMMARY = "Mail Merge Functionality for LibreOffice"
DESCRIPTION = "This module allows you to create form letters or send E-mail messages \
to many recipients using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-mailmerge-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "c9bc9ad8d4f655a3f469e1d46b9bd75136bba2b4669affc3814cf9c540eb3c58ab9153d750c0f3b4758abd34f22b6545354e93c0f214a1ca15b368a91dbd2a6b"

RPROVIDES:${PN} += "libreoffice-mailmerge"

RDEPENDS:${PN} += "libreoffice-pyuno"

inherit rpm
