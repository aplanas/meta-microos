SUMMARY = "Interactive System Activity Grapher for sysstat"
DESCRIPTION = "This package includes the isag command, which graphically displays the \
system activity data stored in a binary data produced by a sar command \
from a sysstat package."
LICENSE = "GPL-2.0-or-later"

PV = "12.6.2"

RPM_NAME = "sysstat-isag-12.6.2-2.1.aarch64.rpm"
RPM_HASH = "40eda3b7f5f386a1fa17b3b3b9d43e5a6009ad4de5cca31ff09f996ad860d1ed75691827dd55fea6d6c4c98db70c47b90b1f1b4e64001c94587b83fdd67c2264"

RPROVIDES:${PN} += "sysstat-isag"

RDEPENDS:${PN} += "/usr/bin/sh \
gnuplot \
sysstat \
tk"

inherit rpm
