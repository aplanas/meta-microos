SUMMARY = "Javadoc for jetbrains-annotations"
DESCRIPTION = "This package contains javadoc for jetbrains-annotations."
LICENSE = "Apache-2.0"

PV = "23.0.0"

RPM_NAME = "jetbrains-annotations-javadoc-23.0.0-2.1.noarch.rpm"
RPM_HASH = "02651adbd03213189aceb6787e7c299791f07677ba7eca4f133e6c97ab04c380d7f0403d3d45d4e4ffb6747c7be373ab155d921a6b3ef0752b97c3962f0899ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetbrains-annotations-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
