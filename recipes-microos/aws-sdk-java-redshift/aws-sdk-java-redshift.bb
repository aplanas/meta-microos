SUMMARY = "AWS Java SDK for Amazon Redshift"
DESCRIPTION = "The AWS Java SDK for Amazon Redshift module holds the \
client classes that are used for communicating with \
Amazon Redshift Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-redshift-1.11.3-7.8.noarch.rpm"
RPM_HASH = "d116d9c9def65a330c8777faa8c52ff3a8bce7180d3eef42cd65ae0dae73ce4a7aa073a2f70cebb98a48a727118756ff44be7ba1708ead78f00fb544a05f4a6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-redshift mvn(com.amazonaws:aws-java-sdk-redshift) mvn(com.amazonaws:aws-java-sdk-redshift:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
