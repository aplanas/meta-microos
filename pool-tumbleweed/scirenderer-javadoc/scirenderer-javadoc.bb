SUMMARY = "Javadoc for scirenderer"
DESCRIPTION = "This package contains the documentation for SciRenderer."
LICENSE = "CECILL-2.0"

PV = "1.1.0"

RPM_NAME = "scirenderer-javadoc-1.1.0-6.7.noarch.rpm"
RPM_HASH = "77d9ff894addf28e4cfdb1d744d9d07ee2d993ebdc8e79f0dab631cf82296c674c4fffd25d7c469becc6383b7110fc146d76960f32f574560b1fda766629851f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scirenderer-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
