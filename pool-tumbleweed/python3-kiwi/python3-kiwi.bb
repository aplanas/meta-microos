SUMMARY = "KIWI - Appliance Builder Next Generation"
DESCRIPTION = "Python 3 library of the KIWI Image System. Provides an operating system \
image builder for Linux supported hardware platforms as well as for \
virtualization and cloud systems like Xen, KVM, VMware, EC2 and more."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "python3-kiwi-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "5c0ad7f45582d1b4c677dda6eef7bb0875b92973baa9e08671a2c3ffcf662e219c72296794ca0c2f90d7f2873989428fb9cd01455717628aeab926860b486e4e"

RPROVIDES:${PN} += "python3-kiwi \
python3-kiwi(aarch-64) \
python3.10dist(kiwi) \
python3dist(kiwi)"

RDEPENDS:${PN} += "/usr/bin/python3 \
kiwi-systemdeps-core \
python(abi) \
python3 \
python3-PyYAML \
python3-docopt \
python3-lxml \
python3-pyxattr \
python3-requests \
python3-setuptools \
python3-simplejson \
screen"

inherit rpm
