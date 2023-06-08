SUMMARY = "Vietnamese (Tiếng Việt) Dictionary for Aspell"
DESCRIPTION = "A Vietnamese (Tiếng Việt) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01.1"

RPM_NAME = "aspell-vi-0.01.1-2.14.aarch64.rpm"
RPM_HASH = "b76f31ffdc06e8b5b3f1f787a57591c7dcd8fa73c71a146b7cc97a7eb391c8b262bddcf1fcd46bee89a4c1d158d9ad034215c4103329049bd5b34bd4240972e5"

RPROVIDES:${PN} += "aspell-vi aspell-vi(aarch-64) locale(aspell:vi)"
RDEPENDS:${PN} += ""

inherit rpm
