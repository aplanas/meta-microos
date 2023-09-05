SUMMARY = "Client for managing kubevirt"
DESCRIPTION = "The virtctl client is a command-line utility for managing container native virtualization resources"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virtctl-1.0.0-7.1.aarch64.rpm"
RPM_HASH = "99a48a6d0ce118cda2f69a1e57662b94733667ce98b6ef0c7c0dae3eb6ebf8e15d068e251db9c5dbf8c4bce79d43d4bc06b280fceaaa9d55fbf5a0b51bf47df9"

RPROVIDES:${PN} += "kubevirt-virtctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
