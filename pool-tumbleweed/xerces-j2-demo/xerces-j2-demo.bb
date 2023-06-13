SUMMARY = "Demonstrations and samples for xerces-j2"
DESCRIPTION = "Demonstrations and samples for xerces-j2."
LICENSE = "Apache-2.0 & W3C"

PV = "2.12.2"

RPM_NAME = "xerces-j2-demo-2.12.2-2.6.noarch.rpm"
RPM_HASH = "cbae210a6234f9a306514356746182c6ca7e1b4aa0fcb0bf5bb8e754a6d9392a8348c60caff5182a68758f8beed1fa01203163dc9ade407db4a7a74244d0911a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xerces-j2-demo"

RDEPENDS:${PN} += "xerces-j2"

inherit rpm
