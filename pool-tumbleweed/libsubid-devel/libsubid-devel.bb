SUMMARY = "Development files for libsubid4"
DESCRIPTION = "Development files for libsubid4."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "libsubid-devel-4.14.0-1.1.aarch64.rpm"
RPM_HASH = "5260977126cdc5070a181a8cc9a938383cff85c16d6d5794c6bbfc80d963e59bf54e7372bb41af9d1d7644f80e91abfa11b68f8dda80121dff0a8d549edb2711"

RPROVIDES:${PN} += "libsubid-devel"

RDEPENDS:${PN} += "libsubid4"

inherit rpm
