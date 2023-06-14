SUMMARY = "Tamil (தமிழ்) Dictionary for Aspell"
DESCRIPTION = "A Tamil (தமிழ்) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "20040424"

RPM_NAME = "aspell-ta-20040424-2.14.aarch64.rpm"
RPM_HASH = "9dd4ede53f96537b5ff9751b2357a1bccaecd72c7177b03ecf2745c1b1a1635a04f7e0e2cc5d0aff2b96bb0f06be7c06f1b0292b30bf8258b21290cac5be67ca"

RPROVIDES:${PN} += "aspell-ta \
locale-aspell-ta"

RDEPENDS:${PN} += ""

inherit rpm
