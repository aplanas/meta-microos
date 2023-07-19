SUMMARY = "A cli tool to help discover deprecated apiVersions in Kubernetes"
DESCRIPTION = "Pluto is a utility to help users find deprecated Kubernetes apiVersions in their code repositories and their helm releases."
LICENSE = "Apache-2.0"

PV = "5.18.1"

RPM_NAME = "pluto-5.18.1-1.1.aarch64.rpm"
RPM_HASH = "09df8de68ff11c63baff5178fcb6c737b048aff484317bcb645b914a3d8062fde8ccb71b4f292d4454a33414fbb119b372ed22a3fe5ee04c0fbf922ef88c5383"

RPROVIDES:${PN} += "pluto"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
