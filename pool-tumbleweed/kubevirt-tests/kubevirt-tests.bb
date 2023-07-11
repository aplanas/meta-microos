SUMMARY = "Kubevirt functional tests"
DESCRIPTION = "The package provides Kubevirt end-to-end tests."
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-tests-0.59.2-1.1.aarch64.rpm"
RPM_HASH = "3a1e66877892c049ab13939ae8c55933cf02056be723943ee34b89d9a15eff313f43897663eca55487d2b2e0ed2bce93289f038eb7db17c6fbce79ad121ef10f"

RPROVIDES:${PN} += "kubevirt-tests"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
