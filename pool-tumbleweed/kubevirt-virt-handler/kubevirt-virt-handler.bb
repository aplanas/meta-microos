SUMMARY = "Handler component for kubevirt"
DESCRIPTION = "The virt-handler package provides a handler for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virt-handler-0.59.2-2.1.aarch64.rpm"
RPM_HASH = "2225e15094130b8d3f8407a625d6168a6a51b40ea0b9c1d40316ceae98358aa5c408524fb7e32ee31368ae8e9563a6b7611375b25b45093a3fe02c73ff706c8e"

RPROVIDES:${PN} += "kubevirt-virt-handler"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
