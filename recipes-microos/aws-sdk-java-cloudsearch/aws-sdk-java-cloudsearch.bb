SUMMARY = "AWS Java SDK for Amazon CloudSearch"
DESCRIPTION = "The AWS Java SDK for Amazon CloudSearch module holds the \
client classes that are used for communicating with \
Amazon CloudSearch Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudsearch-1.11.3-7.8.noarch.rpm"
RPM_HASH = "1915377024e65c1b16620de7b7f8c16b8b72e72e8888e67374062dbc06244bb6badffaf4e80aa3e6c5aac4cebf929a971e4f2df028b37f82d0503b4f94ea10b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudsearch mvn(com.amazonaws:aws-java-sdk-cloudsearch) mvn(com.amazonaws:aws-java-sdk-cloudsearch:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
