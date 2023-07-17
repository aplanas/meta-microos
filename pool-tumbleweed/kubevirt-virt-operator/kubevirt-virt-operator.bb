SUMMARY = "Operator component for kubevirt"
DESCRIPTION = "The virt-opertor package provides an operator for kubevirt CRD"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virt-operator-0.59.2-2.1.aarch64.rpm"
RPM_HASH = "7625d42241d46d85098c548db15516c223bac481482a8996a5f02424961edbb2dbd6edff93ebbeb125be5ba9774608ac3bb8641c84f0eb7d59e2d4b52d614ae5"

RPROVIDES:${PN} += "kubevirt-virt-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
