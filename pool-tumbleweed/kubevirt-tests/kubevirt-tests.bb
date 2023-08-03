SUMMARY = "Kubevirt functional tests"
DESCRIPTION = "The package provides Kubevirt end-to-end tests."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-tests-1.0.0-3.1.aarch64.rpm"
RPM_HASH = "53519335473f0381bd78a9b78200a5cd4ad3d918f8c115d1f38364ff869eab181ea16ce25ee736af68d45685a52d4f9f4fe75675603cb2668d702b7bdaea2953"

RPROVIDES:${PN} += "kubevirt-tests"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
