SUMMARY = "A binary reaping children"
DESCRIPTION = "This executable can be used as a minimal init process inside a container."
LICENSE = "Apache-2.0"

PV = "3.2"

RPM_NAME = "kubernetes-pause-3.2-1.14.aarch64.rpm"
RPM_HASH = "d0b8d35649d6abfa3ad789b5e1efffb030db6de4c181ff8b0598be0574fa944df54272efba0a7666f29643fb7010c171231871f4a15afcb3c179669391bbc195"

RPROVIDES:${PN} += "kubernetes-pause \
kubic-pause"

RDEPENDS:${PN} += ""

inherit rpm
