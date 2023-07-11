SUMMARY = "KIWI - Appliance Builder Next Generation"
DESCRIPTION = "Python 3 library of the KIWI Image System. Provides an operating system \
image builder for Linux supported hardware platforms as well as for \
virtualization and cloud systems like Xen, KVM, VMware, EC2 and more."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "python3-kiwi-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "2f6a3ec402ddad92d251e622689e0eb165c6ab42594a733b1609145d1642cb3078a879b39a82d19d286711ebb083593bc8fc66a48ff8c5133e9c2fc435ef411e"

RPROVIDES:${PN} += "python3-kiwi \
python3.11dist-kiwi \
python3dist-kiwi"

RDEPENDS:${PN} += "/usr/bin/python3 \
kiwi-systemdeps-core \
python-abi \
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
