SUMMARY = "Plymouth 'Spinfinity' theme"
DESCRIPTION = "This package contains the 'Spinfinity' boot splash theme for \
Plymouth. It features a centered logo and animated spinner that \
spins in the shape of an infinity sign."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-spinfinity-22.02.122+94.4bd41a3-6.1.noarch.rpm"
RPM_HASH = "a405bedcf56d75de033d4d8937df9b5ed15fa318148f510a981590e86d03194f327ee8153bbb6454dfcb2f24cfe4dc8a85bede65c780ce5e2be1134a966f0f3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-spinfinity"

RDEPENDS:${PN} += "/usr/bin/sh \
plymouth \
plymouth-scripts"

inherit rpm
