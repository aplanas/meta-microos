SUMMARY = "A text hyphenation library"
DESCRIPTION = "Hyphen is a library for high quality hyphenation and justification."
LICENSE = "GPL-2.0+ | LGPL-2.0+ | MPL-1.1+"

PV = "2.8.8"

RPM_NAME = "hyphen-2.8.8-2.26.aarch64.rpm"
RPM_HASH = "0e1a74ed430339c6a26a7a848fd08a5b5152b11846505e4120865a375670941a6264299b3eb0ed4719f3edae279382aef1ed295f047376c5b0a950c73963a259"

RPROVIDES:${PN} += "hyphen \
hyphen(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
