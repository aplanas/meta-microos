SUMMARY = "AWS Java SDK for Amazon Redshift"
DESCRIPTION = "The AWS Java SDK for Amazon Redshift module holds the \
client classes that are used for communicating with \
Amazon Redshift Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-redshift-1.11.3-7.9.noarch.rpm"
RPM_HASH = "579c32c468fa7805d299fee5c7c31f7ec35b7bcd6a2f0db56b593731a9111164cbf28c138f764c50e16fb9512a7c4fc959c40b4da244a6aa6b82c91f0278faa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-redshift \
mvn-com.amazonaws-aws-java-sdk-redshift \
mvn-com.amazonaws-aws-java-sdk-redshift-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
