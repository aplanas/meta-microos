SUMMARY = "KIWI - Appliance Builder Next Generation"
DESCRIPTION = "Python 3 library of the KIWI Image System. Provides an operating system \
image builder for Linux supported hardware platforms as well as for \
virtualization and cloud systems like Xen, KVM, VMware, EC2 and more."
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "python3-kiwi-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "751a11e173cd9ec11f3be1b345a8e5326256a98af6730fb9f093c15be9217b301db491da7e7996425853d11b59a85aaa326bdec628c09390265477cd005951a6"

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
python3-requests \
python3-setuptools \
python3-simplejson \
screen"

inherit rpm
