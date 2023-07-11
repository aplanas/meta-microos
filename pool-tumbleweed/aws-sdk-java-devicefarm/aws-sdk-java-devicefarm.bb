SUMMARY = "AWS Java SDK for AWS Device Farm"
DESCRIPTION = "The AWS Java SDK for AWS Device Farm module \
holds the client classes that are used for \
communicating with AWS Device Farm."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-devicefarm-1.11.3-7.9.noarch.rpm"
RPM_HASH = "e903c8d256e20682259d9829fdaefa43c3d1653df5ae0aa6897bbbf09ee6d1de417800c468205e92e8d921bd2bde22ea0c9209f63c99722a62a9c9a5f39cb790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-devicefarm \
mvn-com.amazonaws-aws-java-sdk-devicefarm \
mvn-com.amazonaws-aws-java-sdk-devicefarm-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
