SUMMARY = "Kickstart over a network"
DESCRIPTION = "Koan stands for kickstart-over-a-network and allows for both network \
installation of new virtualized guests and reinstallation of an existing \
system. For use with a boot-server configured with Cobbler."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "koan-3.0.1-2.5.noarch.rpm"
RPM_HASH = "3f9f0e4d0337e69ffc91c9d4c26299587f6ab54e60fa367a626a19166ca7fd736e2c4c4e55756998e162841e7086e63a9923e21de2ce88db253663fee5eb02f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "koan \
python3.11dist-koan \
python3dist-koan"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-distro \
python3-libvirt-python \
python3-netifaces"

inherit rpm
