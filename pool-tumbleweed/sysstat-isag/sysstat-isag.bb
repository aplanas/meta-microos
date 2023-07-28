SUMMARY = "Interactive System Activity Grapher for sysstat"
DESCRIPTION = "This package includes the isag command, which graphically displays the \
system activity data stored in a binary data produced by a sar command \
from a sysstat package."
LICENSE = "GPL-2.0-or-later"

PV = "12.6.2"

RPM_NAME = "sysstat-isag-12.6.2-3.1.aarch64.rpm"
RPM_HASH = "222a77ec804741089de3c6a70622317b4d6ac116a0c64bdb110649d818d20c3dff3467ec8452f236196ddc3c8361580560b24132001013a2ab5f5e387490f5e1"

RPROVIDES:${PN} += "sysstat-isag"

RDEPENDS:${PN} += "/usr/bin/sh \
gnuplot \
sysstat \
tk"

inherit rpm
