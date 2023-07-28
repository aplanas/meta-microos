SUMMARY = "Kubevirt functional tests"
DESCRIPTION = "The package provides Kubevirt end-to-end tests."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-tests-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "427c7df771b44de75790afb6dbe7eec996620194db16cf60f41422dfc85f8ccd20a31d9594ac72fc0a45ead0c932e6195908341b5ff15e6ea24ca9894b920fdf"

RPROVIDES:${PN} += "kubevirt-tests"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
