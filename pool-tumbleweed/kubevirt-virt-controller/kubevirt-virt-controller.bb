SUMMARY = "Controller for kubevirt"
DESCRIPTION = "The virt-controller package provides a controller for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-controller-1.0.0-7.1.aarch64.rpm"
RPM_HASH = "074c7765a860f7cb1b5de146ba77b47d524a75baa413139317e3b924cbc29ee2f4a584982e0f8b4f2331ac1ce11010fb3baa2c3a69bb6335d229ad1043baa70c"

RPROVIDES:${PN} += "kubevirt-virt-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
