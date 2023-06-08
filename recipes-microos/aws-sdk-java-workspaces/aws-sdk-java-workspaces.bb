SUMMARY = "AWS Java SDK for Amazon WorkSpaces"
DESCRIPTION = "The AWS Java SDK for Amazon WorkSpaces module holds the \
client classes that are used for communicating with \
Amazon WorkSpaces Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-workspaces-1.11.3-7.8.noarch.rpm"
RPM_HASH = "f918e29404d52f8a8176d2db5e57ab31c76c9e699995d94f40d869d015de2aa484dc61bd87219880e55a169d894ca3fc5f6bd435df8614c1bb951a29fb19c56f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-workspaces mvn(com.amazonaws:aws-java-sdk-workspaces) mvn(com.amazonaws:aws-java-sdk-workspaces:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
