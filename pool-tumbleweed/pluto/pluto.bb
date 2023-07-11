SUMMARY = "A cli tool to help discover deprecated apiVersions in Kubernetes"
DESCRIPTION = "Pluto is a utility to help users find deprecated Kubernetes apiVersions in their code repositories and their helm releases."
LICENSE = "Apache-2.0"

PV = "5.17.0"

RPM_NAME = "pluto-5.17.0-1.1.aarch64.rpm"
RPM_HASH = "e8f18491c03d2475381acfec48860a80aa7ad72499175e361deff4e1b31e56f079f4343f6764bf945b301788fff5af0817caed59acfac01afaac435fa1d76192"

RPROVIDES:${PN} += "pluto"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
