SUMMARY = "Library to parse Passbook files"
DESCRIPTION = "kpkpass is a library to read and parse Apple Passbook files, such as the ones \
commonly used for hotel and flight reservations."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kpkpass-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "432aafa79f8d255bc58fa55686f5ac43f9644524da77297a592e95f5a654185b9acff0359f9f3482e4ddd071b6348cb3ea8188b4b0820255148aa32ca7f25b79"

RPROVIDES:${PN} += "kpkpass"

RDEPENDS:${PN} += ""

inherit rpm
