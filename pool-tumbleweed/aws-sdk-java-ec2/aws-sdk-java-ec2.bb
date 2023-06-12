SUMMARY = "AWS Java SDK for Amazon EC2"
DESCRIPTION = "The AWS Java SDK for Amazon EC2 module holds the \
client classes that are used for communicating with \
Amazon EC2 Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-ec2-1.11.3-7.8.noarch.rpm"
RPM_HASH = "600b107927477709617cf972432087b1c85b9fc4172104c4ffe86b5c969ae98dcf68f6765d82e03323093d65a1c93c07b432aacc1cf876a5d134f0cbc3e24e21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-ec2 \
mvn(com.amazonaws:aws-java-sdk-ec2) \
mvn(com.amazonaws:aws-java-sdk-ec2:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
