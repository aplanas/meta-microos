SUMMARY = "Tool to select fonts"
DESCRIPTION = "It is a program similar to xfontsel. \
 \
 \
 \
Authors: \
-------- \
    Neil Grant <grantj@sfu.ca>"
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "tkfont-1.1-958.6.noarch.rpm"
RPM_HASH = "022b8ee45f0670b20330e50e076570710784328f61ef665e85b2ab3a9fa538758d0080ecf32c4088e7440666c287a6c7027e3d0f7e8cb79e235ef37a15243225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tkfont"

RDEPENDS:${PN} += "/usr/bin/sh \
tk \
xlsfonts"

inherit rpm
