SUMMARY = "Kubevirt functional tests"
DESCRIPTION = "The package provides Kubevirt end-to-end tests."
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-tests-0.59.0-3.2.aarch64.rpm"
RPM_HASH = "f69f7ed8b4bb341adbf7d208675e6b7bfdcb3303f7316a015e87facc1a895726840a880df69edd239ca1c3455ae5804e562b97f1f038f7bca30d9372bdf700ae"

RPROVIDES:${PN} += "kubevirt-tests"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
