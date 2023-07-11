SUMMARY = "Handler component for kubevirt"
DESCRIPTION = "The virt-handler package provides a handler for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virt-handler-0.59.2-1.1.aarch64.rpm"
RPM_HASH = "f6748acc5113bde3a1dc69e7fab8326033a038241c3ead9d11cb66a5dffec40e48116bc77eddb6350f586a1fb48500ecf03b84a00c0a9b984e32637144502720"

RPROVIDES:${PN} += "kubevirt-virt-handler"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
