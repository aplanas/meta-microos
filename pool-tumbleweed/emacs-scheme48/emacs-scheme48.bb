SUMMARY = "CMUScheme48 emacs mode"
DESCRIPTION = "Scheme process in a buffer.  Adapted from cmuscheme.el"
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "emacs-scheme48-1.9.2-2.20.aarch64.rpm"
RPM_HASH = "1d1cc355da55d90fb681362d0f8fd8684ec3236ecb5e7ae1cef7f4b4181ea1d0934781b72c0da414cd885d046e3e8a60d69e4208424f500b268cdf2eed39088c"

RPROVIDES:${PN} += "emacs-scheme48"

RDEPENDS:${PN} += "scheme48"

inherit rpm
