SUMMARY = "League Of Movable Type's 'Junction' font"
DESCRIPTION = "Junction is a a humanist sans-serif, and the first open-source type project started by The League of Moveable Type."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-junction-fonts-0.20121218-8.7.noarch.rpm"
RPM_HASH = "214004b93b2d23e0150b9aaf48f70f7b2290a8383b0a5efae920170932701b500fc2f3ea05258e1c009c0e734214d730d30617ffe1a9f7a2238d571050e6cb7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-junction-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
