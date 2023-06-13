SUMMARY = "Ruby bindings for libsuseconnect library"
DESCRIPTION = "This package provides bindings needed to use libsuseconnect from Ruby scripts."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0~git0.e3c41e60892e"

RPM_NAME = "suseconnect-ruby-bindings-1.1.0~git0.e3c41e60892e-1.2.aarch64.rpm"
RPM_HASH = "2ee2214158e7de2db9d2433ec9e50ad01efbb62d61a92900352f761d086b04642804adb62ee3ee5aaeeaa01fa87fedd20159e0ccfe392200d907597a43807bf7"

RPROVIDES:${PN} += "suseconnect-ruby-bindings \
suseconnect-ruby-bindings(aarch-64)"

RDEPENDS:${PN} += "libsuseconnect"

inherit rpm
