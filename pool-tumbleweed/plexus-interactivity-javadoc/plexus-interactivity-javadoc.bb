SUMMARY = "API documentation for plexus-interactivity"
DESCRIPTION = "This package provides API documentation for plexus-interactivity."
LICENSE = "MIT"

PV = "1.0~alpha6"

RPM_NAME = "plexus-interactivity-javadoc-1.0~alpha6-2.7.noarch.rpm"
RPM_HASH = "f21f174eefeddc783e4769807b4992fb2e5caa60a5a9c0d6de3945bf29d92afadd47991b42fc529e89cc056a3e2425a6a97ca0b3a6a4ea88332f5d5d9f385f91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-interactivity-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
