SUMMARY = "Kubevirt functional tests"
DESCRIPTION = "The package provides Kubevirt end-to-end tests."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-tests-1.0.0-7.1.aarch64.rpm"
RPM_HASH = "43485284a304e9386cdbf567c7f5f377b6de6a2ed67f331fff8928fe41c6d5bf3597479c085d5ad01121ff07b1faed38414c7cb17b6e4fba2afbbf05b94530d6"

RPROVIDES:${PN} += "kubevirt-tests"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
