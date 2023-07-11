SUMMARY = "Freepascal Compiler - sources"
DESCRIPTION = "The fpc-src package contains the sources of Freepascal, for \
documentation or automatical-code generation purposes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "fpc-src-3.2.2-3.10.aarch64.rpm"
RPM_HASH = "eccee3b7c6d6bf0a34032d7bfcbd024917b545a00d7c54e8cc553cdf9ebf36d294e61ad830d8ce993f991823cf57008c9be28d5f5e794d89572253611837fa12"

RPROVIDES:${PN} += "fpc-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/csh \
/usr/bin/env \
/usr/bin/sh"

inherit rpm
