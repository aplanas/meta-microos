SUMMARY = "Documentation for PCB, An interactive printed circuit board editor"
DESCRIPTION = "This package contains the documentation of PCB, an interactive printed circuit \
board editor."
LICENSE = "GPL-2.0-only"

PV = "4.3.0"

RPM_NAME = "pcb-doc-4.3.0-1.11.noarch.rpm"
RPM_HASH = "464b2b58758169944f0ad0f13a031d646fe95231b56053f57b5dce60b2b80c6d4b97fa85c3a2a39148390567cf3ecea345921f4acafc84bc4853583c70f284af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcb-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
