SUMMARY = "Commons Daemon Javadoc"
DESCRIPTION = "The Javadoc Documentation for Commons Daemon."
LICENSE = "Apache-2.0"

PV = "1.3.3"

RPM_NAME = "apache-commons-daemon-javadoc-1.3.3-1.1.noarch.rpm"
RPM_HASH = "58efbb0e7f257aa46afdc9c52aaa5f0662c2a185e63918f0236b76e408b6fd3adc2eb271f9b7450f659ef91df4e026f91d393e0f273b9b560a3579dad293a488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-daemon-javadoc jakarta-commons-daemon-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
