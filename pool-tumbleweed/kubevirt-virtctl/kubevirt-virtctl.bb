SUMMARY = "Client for managing kubevirt"
DESCRIPTION = "The virtctl client is a command-line utility for managing container native virtualization resources"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virtctl-0.59.2-2.1.aarch64.rpm"
RPM_HASH = "093c2514a4c67f20dfc7281a95b0ebbe54708f9d2634b1e821b5eb1001c8dd677990c007061ea3e4ec983d7c14dfa1e3fa03af7ba4ceeac09c715d3d0797b52a"

RPROVIDES:${PN} += "kubevirt-virtctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
