SUMMARY = "AWS Java SDK for AWS CodeCommit"
DESCRIPTION = "The AWS Java SDK for AWS CodeCommit module \
holds the client classes that are used for \
communicating with AWS CodeCommit."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-codecommit-1.11.3-7.8.noarch.rpm"
RPM_HASH = "92e9d20687a30493196f90d20fdc2abdb32baa03e53274b01f92fa3756b3bedb3811512de02e307039bb301afccd36be49babd5312338b60bac864894de1b2d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-codecommit \
mvn-com.amazonaws-aws-java-sdk-codecommit \
mvn-com.amazonaws-aws-java-sdk-codecommit-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
