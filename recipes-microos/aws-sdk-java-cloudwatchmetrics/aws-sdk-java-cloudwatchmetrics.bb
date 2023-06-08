SUMMARY = "CloudWatch Metrics for AWS Java SDK"
DESCRIPTION = "This package holds the classes for uploading the \
client side metrics collected from AWS Java SDK to \
Amazon CloudWatch."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudwatchmetrics-1.11.3-7.8.noarch.rpm"
RPM_HASH = "04f87bc81a92c934725ee157f26423d72b6fa2cb610dfd7c0b22e408b82ac41efde8a1794238f71996ce7aafbb9db208086fa219c43d7f793a5c86b35d63cfac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudwatchmetrics mvn(com.amazonaws:aws-java-sdk-cloudwatchmetrics) mvn(com.amazonaws:aws-java-sdk-cloudwatchmetrics:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-cloudwatch) mvn(com.amazonaws:aws-java-sdk-core) mvn(com.amazonaws:aws-java-sdk-dynamodb)"

inherit rpm
