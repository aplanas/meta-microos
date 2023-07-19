SUMMARY = "Client for managing kubevirt"
DESCRIPTION = "The virtctl client is a command-line utility for managing container native virtualization resources"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virtctl-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "102e1089c602e071b61942e8c61c258a8afa12407bd554cb3269e6789d3c5bf352e3a23bef8664a1d35967566da6579b49a4ac0ef5de33e5374608a2c1fcacd8"

RPROVIDES:${PN} += "kubevirt-virtctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
