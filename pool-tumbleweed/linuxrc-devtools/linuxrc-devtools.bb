SUMMARY = "Tools to submit from Git to OBS via Jenkins"
DESCRIPTION = "This is a collection of scripts used to connect github via jenkins to the \
open build service."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "linuxrc-devtools-1.3-1.1.noarch.rpm"
RPM_HASH = "8e2daf833fee49aae232b42eec8af34d6a42cd49ab9a0863502b1fb19d4d66a9373e8f04177b6cc174aa15457f60671e54dd69133d27407ff178407ef4c510c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linuxrc-devtools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl"

inherit rpm
