SUMMARY = "A cli tool to help discover deprecated apiVersions in Kubernetes"
DESCRIPTION = "Pluto is a utility to help users find deprecated Kubernetes apiVersions in their code repositories and their helm releases."
LICENSE = "Apache-2.0"

PV = "5.16.4"

RPM_NAME = "pluto-5.16.4-1.1.aarch64.rpm"
RPM_HASH = "0d8ece2781a742cae0d42fb0dac00cb3331a6cc0e0aade76cd9759ba3f34d4ad3ed7ccf3c418f2b643065d881cdbeb6aa659f37be24f1095aa36421d84ad2a24"

RPROVIDES:${PN} += "pluto \
pluto(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
