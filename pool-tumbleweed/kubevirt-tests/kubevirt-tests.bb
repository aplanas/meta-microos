SUMMARY = "Kubevirt functional tests"
DESCRIPTION = "The package provides Kubevirt end-to-end tests."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-tests-1.0.0-6.1.aarch64.rpm"
RPM_HASH = "5fbfdeb533db187462799418fc0a869368f7db4f6c79a6950c0f828e0f7896d31d90f29bcf68e7b75282744cfd312aacdbc7582a0f338fad3e6c522cb4be21a5"

RPROVIDES:${PN} += "kubevirt-tests"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
