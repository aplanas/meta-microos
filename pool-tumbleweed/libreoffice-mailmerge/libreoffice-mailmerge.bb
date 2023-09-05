SUMMARY = "Mail Merge Functionality for LibreOffice"
DESCRIPTION = "This module allows you to create form letters or send E-mail messages \
to many recipients using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-mailmerge-7.6.1.1-1.1.aarch64.rpm"
RPM_HASH = "57e4af488f09d40d162d1de4889d19eeafa09a1e5434785664533e7f5d373d87a3246a74a2378da06b89b5fb72907821d5a21df3ce3fb9cbe725e9de95625ebf"

RPROVIDES:${PN} += "libreoffice-mailmerge"

RDEPENDS:${PN} += "libreoffice-pyuno"

inherit rpm
