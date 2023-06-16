SUMMARY = "The ghostscript container to wrap ghostscript within"
DESCRIPTION = "If the option -dSAFER is used with gswrap, this script uses bwrap \
from the 'bubblewrap' package to embbedd the final ghostscript \
command within a minimal container. For this, a new, completely empty \
filesystem namespace on a tmpfs is populated with the required \
libraries and files to run the ghostscript command."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1"

RPM_NAME = "gswrap-0.1-9.6.noarch.rpm"
RPM_HASH = "1351033159c355aab82dccdb1f18536d9c573e604d3c255e05efac7347bb0986e37e5bb8b8b59ec53eded1acb40a7975d6f1cc8f7707fc41432b0e1eed00210c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gswrap \
gswrap"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/gs.bin \
/usr/bin/sh \
bubblewrap \
coreutils \
sed \
update-alternatives"

inherit rpm
