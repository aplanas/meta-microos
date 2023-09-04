SUMMARY = "Javadoc for jackson-dataformat-xml"
DESCRIPTION = "This package contains API documentation for jackson-dataformat-xml."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-xml-javadoc-2.15.2-1.1.noarch.rpm"
RPM_HASH = "f0045be0b4a5b80a798e78e8650a07a9509b9f9420c4da5769bb0602731ba71b9e56ae6207679ae362dcd3e6dba3df1d739171911a0ba90563f560ab8e1ee64b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-xml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
