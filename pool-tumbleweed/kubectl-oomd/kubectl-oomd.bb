SUMMARY = "Show pods/containers which have recently been 'OOMKilled'"
DESCRIPTION = "kubectl plugin to display the pods and containers which have recently been OOMKilled."
LICENSE = "Apache-2.0"

PV = "0.0.7"

RPM_NAME = "kubectl-oomd-0.0.7-1.5.aarch64.rpm"
RPM_HASH = "d33f912fde127f4a41e0d7de7ae292b98eeb4ceaaa70b653db01c089550a1df4d1131feab049f42f57bbc6a81f3e98b4ea3fe1926ac5c3e4266161a78d767972"

RPROVIDES:${PN} += "kubectl-oomd"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
