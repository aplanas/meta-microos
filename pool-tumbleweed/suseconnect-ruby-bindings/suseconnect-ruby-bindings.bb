SUMMARY = "Ruby bindings for libsuseconnect library"
DESCRIPTION = "This package provides bindings needed to use libsuseconnect from Ruby scripts."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0~git0.abd0fec"

RPM_NAME = "suseconnect-ruby-bindings-1.2.0~git0.abd0fec-1.1.aarch64.rpm"
RPM_HASH = "d596a884bc9ef49f53593e420096390966943421feaeb6a594b99606d381ef61f467fdbec88bb55b0107900d27066e00a4a782f5523359cdf403b8bd1e3c3813"

RPROVIDES:${PN} += "suseconnect-ruby-bindings"

RDEPENDS:${PN} += "libsuseconnect"

inherit rpm
