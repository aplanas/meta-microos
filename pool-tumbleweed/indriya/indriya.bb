SUMMARY = "Next Generation Units of Measurement Implementation"
DESCRIPTION = "Units of Measurement Libraries - JSR 385 Reference Implementation"
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "indriya-1.3-3.9.noarch.rpm"
RPM_HASH = "0d3bbfe2858ce19699b6b196aeff55aac1a937f8a1918fbf8edfbdfa9721f0dffe51385f67bd8b353c6b19e0bebff0415bf89ffea6b3bb20f6eb9689510ba7cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "indriya \
mvn(tech.units:indriya) \
mvn(tech.units:indriya:pom:) \
osgi(tech.units.indriya)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(javax.measure:unit-api) \
mvn(tech.uom.lib:uom-lib-common)"

inherit rpm
