SUMMARY = "AWS Java SDK for Amazon S3"
DESCRIPTION = "The AWS Java SDK for Amazon S3 module holds the \
client classes that are used for communicating with \
Amazon Simple Storage Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-s3-1.11.3-7.8.noarch.rpm"
RPM_HASH = "1b1fd48d5ea6e138ea879db7f80b0912b811f1f0ac6785e1cf0f8222d36697ac462ee19ba6d02b6c9e5f8047e928e23b00df148a60df440711844973dbca7862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-s3 \
mvn-com.amazonaws-aws-java-sdk-s3 \
mvn-com.amazonaws-aws-java-sdk-s3-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-kms"

inherit rpm
