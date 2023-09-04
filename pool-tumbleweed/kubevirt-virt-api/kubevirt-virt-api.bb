SUMMARY = "Kubevirt API server"
DESCRIPTION = "The virt-api package provides the kubernetes API extension for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-api-1.0.0-6.1.aarch64.rpm"
RPM_HASH = "26026721be972e462e8bfcc3d6f653ccba8954d8b3fe4dc2e7c3a02aa75c5e7e5809d4fa0ab37399468c98badd41ea54c19006f09c99fb8b49e361f67aa5aac9"

RPROVIDES:${PN} += "kubevirt-virt-api"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
