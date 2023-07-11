SUMMARY = "AWS Java SDK for AWS CodeDeploy"
DESCRIPTION = "The AWS Java SDK for AWS CodeDeploy module holds the \
client classes that are used for communicating with \
AWS CodeDeploy Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-codedeploy-1.11.3-7.9.noarch.rpm"
RPM_HASH = "71a9179ba595af32cf7958bf6bd8dbc7a36065ec7536f50bd60c7bd2f4cdf8b32aa04a2d51c39183ddde688f875222a70c14cf27738b3913dc915a1a277f9b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-codedeploy \
mvn-com.amazonaws-aws-java-sdk-codedeploy \
mvn-com.amazonaws-aws-java-sdk-codedeploy-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
