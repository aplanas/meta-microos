SUMMARY = "Client for managing kubevirt"
DESCRIPTION = "The virtctl client is a command-line utility for managing container native virtualization resources"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virtctl-1.0.0-3.1.aarch64.rpm"
RPM_HASH = "1a5fe5b92c4830aae9dda9ff96acd34c3175fa0172d0901f6642d0c1885ff3b298de046ba19ef20b87631fa72f547a594915b423c4bcfcd3fb35cdec3ad0b056"

RPROVIDES:${PN} += "kubevirt-virtctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
