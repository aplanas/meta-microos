SUMMARY = "Client for managing kubevirt"
DESCRIPTION = "The virtctl client is a command-line utility for managing container native virtualization resources"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virtctl-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "6bd79d0f559224c02d3c755862c1e69f46246e45502b4bf321bd6883ea93554e742b688fd35f03a185be4e7bdb729dce011b4cafcc2f9936f6a3047fabcaaa6c"

RPROVIDES:${PN} += "kubevirt-virtctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
