SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "skelcd-installer-net-MicroOS-17.90-1.30.aarch64.rpm"
RPM_HASH = "de4d488ecc05d34d18b8d36c8e30567b6e02d1ba0722c60cb01704f1a8eb320c100cf79d42ded7b6fc94d075ff0071447c61248fc3e8edb3ea469c69e5d9f018"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
