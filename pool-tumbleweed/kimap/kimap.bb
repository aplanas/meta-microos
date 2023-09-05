SUMMARY = "KDE PIM Libraries: IMAP library"
DESCRIPTION = "KIMAP provides libraries to interface and communicate with \
IMAP mail servers."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kimap-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "4bf3e4a9cc2c16ba098bed6b9cd4140cabaab389099ce78aa34b4ee4da7a620e5fb6c37acc1cf2352855e63af71b623327f9665352545d9d6d731686094d25ac"

RPROVIDES:${PN} += "kimap"

RDEPENDS:${PN} += ""

inherit rpm
