SUMMARY = "Kubevirt functional tests"
DESCRIPTION = "The package provides Kubevirt end-to-end tests."
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-tests-0.59.2-2.1.aarch64.rpm"
RPM_HASH = "a39715197bb46fe18f4870b7665c3552c7c9174dcd703ce149e8666b152614bb12ed064de722f3c733b94cf5f3801b2000f967f6a6d74638efa1e53ac0731dd5"

RPROVIDES:${PN} += "kubevirt-tests"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
