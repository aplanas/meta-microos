SUMMARY = "Static version of Busybox - for building Warewulf3"
DESCRIPTION = "This version of busybox is only for building Warewulf3 \
https://github.com/warewulf/warewulf3"
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-warewulf3-1.36.1-1.1.aarch64.rpm"
RPM_HASH = "2c829d07b06a12a4201465892fed25e6c1fb2e4ea34f3eed237af3077a987535e9cbe9b91e75423dfc362c22e4f7dc1b68fc85df2e5c6afda7f3c0ed28dfd9e8"

RPROVIDES:${PN} += "busybox-warewulf3"

RDEPENDS:${PN} += ""

inherit rpm
