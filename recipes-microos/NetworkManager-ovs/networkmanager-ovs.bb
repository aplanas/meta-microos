SUMMARY = "Open vSwitch device plugin for NetworkManager"
DESCRIPTION = "This package contains NetworkManager support for Open vSwitch bridges."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-ovs-1.42.6-1.1.aarch64.rpm"
RPM_HASH = "1fc4844f2035175fd7afc50363ae263121ae5f4a1c41614e47bb3547c7e76b5ce4c0bb3e6d0969d2a6becc6bb98274aa8bfa380a0c8c9e6a1ce11ebf2aa3046a"

RPROVIDES:${PN} += "NetworkManager-ovs NetworkManager-ovs(aarch-64) libnm-device-plugin-ovs.so()(64bit)"
RDEPENDS:${PN} += "NetworkManager ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libjansson.so.4()(64bit) libjansson.so.4(libjansson.so.4)(64bit) openvswitch"

inherit rpm
