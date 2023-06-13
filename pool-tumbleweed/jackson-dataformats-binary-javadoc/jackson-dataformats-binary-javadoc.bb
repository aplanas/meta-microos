SUMMARY = "Javadoc for jackson-dataformats-binary"
DESCRIPTION = "This package contains API documentation for jackson-dataformats-binary."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.13.3"

RPM_NAME = "jackson-dataformats-binary-javadoc-2.13.3-1.7.noarch.rpm"
RPM_HASH = "56b5da4614ff0133d08fe6e088b91b1e077f32d523d9bd2e8f666b288ad57c3c1d886102bab90c1cbe7386bcec4550204b7b8244a373464ac2f691d38f596938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-binary-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
