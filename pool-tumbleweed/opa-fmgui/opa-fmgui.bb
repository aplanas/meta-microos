SUMMARY = "Fabric Manager Graphical User Interface"
DESCRIPTION = "FMGUI is the Fabric Manager Graphical User Interface.  It can be run by invoking the Bash \
script fmgui."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "10.1.0.0.115"

RPM_NAME = "opa-fmgui-10.1.0.0.115-7.7.noarch.rpm"
RPM_HASH = "1cf90bb9152449da998ec60d9878edbe4a95115f5531c6b8377ca0a5955f3ecafaa42e2a6ae63897c6a85617505e3ee6d4c197c6f2dc7f79aa316860314b25a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-opa-fmgui \
opa-fmgui"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
jre \
mlocate"

inherit rpm
