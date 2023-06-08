SUMMARY = "Javadoc for aws-sdk-java"
DESCRIPTION = "This package contains javadoc for aws-sdk-java."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-javadoc-1.11.3-7.8.noarch.rpm"
RPM_HASH = "1858b781896c90d12aa233886770ece0d4d40447747b591adc3d834d7a7d015c9ad3a0430d1fa0cf32bc7229d6ee24d345ace5c5754b864ffbb4b0f3caba85f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
