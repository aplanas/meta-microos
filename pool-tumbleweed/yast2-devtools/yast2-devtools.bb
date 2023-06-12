SUMMARY = "YaST2 - Development Tools"
DESCRIPTION = "Scripts and templates for developing YaST2 modules and components."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "yast2-devtools-4.6.1-1.1.noarch.rpm"
RPM_HASH = "a84af6ab79300727ab3c80e5422c7a90d3059c9541533b94800dbe43eb8ea984eadbe94a8d8a5c473e80f52c0e5cfaddaf407ea48e8c73632d2dd2a8ef0c8ebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-devtools"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
/usr/bin/perl \
yast2-buildtools"

inherit rpm
