SUMMARY = "Kubevirt functional tests"
DESCRIPTION = "The package provides Kubevirt end-to-end tests."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-tests-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "ccda11242320f0082e700470008c4e80c3bf89a050b9a217acd1a01e3ed724869adf3521bb47ec1eaf14a04dd89bfbdac772fc62fa94dde61b000d0848f9dfc6"

RPROVIDES:${PN} += "kubevirt-tests"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
