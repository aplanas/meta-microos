SUMMARY = "Development files for the FreeIPA HBAC Evaluator library"
DESCRIPTION = "Utility library to validate FreeIPA HBAC rules for authorization \
requests."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "libipa_hbac-devel-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "7dce811421ebf5e9bc6d31e129ca826522fb391100efa08544ba03da4dd7c4d99d9ae44a13f76aa09a971c67416cd48eeb71137bd4f9d12f828e1bbdc4bfc87a"

RPROVIDES:${PN} += "libipa-hbac-devel \
pkgconfig-ipa-hbac"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libipa-hbac0"

inherit rpm
