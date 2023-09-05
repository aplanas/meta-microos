SUMMARY = "Kubevirt API server"
DESCRIPTION = "The virt-api package provides the kubernetes API extension for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-api-1.0.0-7.1.aarch64.rpm"
RPM_HASH = "33302e0138490b73c2bbf41786b5cf5eacc18dccde321001c9d35bcd5d4d6dd76b899a992659c4dda1415b352a5f526a809b03c316b9d166a84f60bafcf5f9fb"

RPROVIDES:${PN} += "kubevirt-virt-api"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
