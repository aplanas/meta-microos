SUMMARY = "Javadoc for scirenderer"
DESCRIPTION = "This package contains the documentation for SciRenderer."
LICENSE = "CECILL-2.0"

PV = "1.1.0"

RPM_NAME = "scirenderer-javadoc-1.1.0-6.6.noarch.rpm"
RPM_HASH = "15f24e5e9e066cbc422822027ba5b9d01eb6b134fbcf23ae18fa0427cab27b0bd0684f65e5603ac63a0c1d97d9ea16de063b6cc688de110db0cd893ae4a5da6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scirenderer-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
