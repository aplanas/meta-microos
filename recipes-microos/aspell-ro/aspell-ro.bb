SUMMARY = "Romanian (română) Dictionary for Aspell"
DESCRIPTION = "A Romanian (română) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.2"

RPM_NAME = "aspell-ro-3.3.2-2.14.aarch64.rpm"
RPM_HASH = "b2b6e409fab8ccd5c99684b346243b1346c7e50b9a85327c5f5dc922ebebcf4a0b0d86d386ff030b2fa60d21846bcc9c987c39cf782f1ba9cc18f65476d9adb4"

RPROVIDES:${PN} += "aspell-ro aspell-ro(aarch-64) locale(aspell:ro)"
RDEPENDS:${PN} += ""

inherit rpm
