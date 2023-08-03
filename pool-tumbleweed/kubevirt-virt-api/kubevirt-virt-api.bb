SUMMARY = "Kubevirt API server"
DESCRIPTION = "The virt-api package provides the kubernetes API extension for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-api-1.0.0-3.1.aarch64.rpm"
RPM_HASH = "c500fa83b0c93e7e99d22c1369b9aa093b7bd182b84522b464679a93dae5e9c316a69a535d2cbbeb44997b62a202a607c1cfd83c4d80552efaa6f801fbc29a66"

RPROVIDES:${PN} += "kubevirt-virt-api"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
