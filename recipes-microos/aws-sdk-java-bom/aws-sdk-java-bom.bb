SUMMARY = "AWS SDK for Java - BOM"
DESCRIPTION = "The AWS SDK for Java - BOM module holds the \
dependency managements for individual Java clients."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-bom-1.11.3-7.8.noarch.rpm"
RPM_HASH = "7d55fa9e7f36dd1ad7f3879f807aa8b0690353ed899ca9642fd109066556ed881f5f40d648bf825d54415fc8f3c2dfb68ce8a1f4fb609a9fbee8eab755fd0e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-bom mvn(com.amazonaws:aws-java-sdk-bom:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-pom:pom:)"

inherit rpm
