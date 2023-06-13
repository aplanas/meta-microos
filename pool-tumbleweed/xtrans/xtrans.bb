SUMMARY = "Library to handle network protocol transport in X"
DESCRIPTION = "xtrans is a library of code that is shared among various X packages to \
handle network protocol transport in a modular fashion, allowing a \
single place to add new transport types. It is used by the X server, \
libX11, libICE, the X font server, and related components."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "xtrans-1.4.0-3.8.noarch.rpm"
RPM_HASH = "73c88c7899aa6cbdc502b4266e434f3c94e5dd1bde56bab3a8e30736a1271e1c1c2b94d1e145dee1eea4ccf681ae78a0559557a7758b51e2029d21c346cf33c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig(xtrans) \
xorg-x11-xtrans-devel \
xtrans"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config"

inherit rpm
