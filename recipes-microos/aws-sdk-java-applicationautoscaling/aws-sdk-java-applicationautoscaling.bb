SUMMARY = "AWS Java SDK for AWS Application Auto Scaling"
DESCRIPTION = "The AWS Java SDK for AWS Application Auto Scaling module \
holds the client classes that are used for communicating \
with AWS Application Auto Scaling service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-applicationautoscaling-1.11.3-7.8.noarch.rpm"
RPM_HASH = "f0a4d082184155256dd00013f5190c0277ff1015ae19db2c2a58bdd1d03bf7138e390237472e04663f06a05c4e62e7408d8d8b5ad1b8da5e28399436ac8a7b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-applicationautoscaling mvn(com.amazonaws:aws-java-sdk-applicationautoscaling) mvn(com.amazonaws:aws-java-sdk-applicationautoscaling:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
