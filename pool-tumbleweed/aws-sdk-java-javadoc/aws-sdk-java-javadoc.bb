SUMMARY = "Javadoc for aws-sdk-java"
DESCRIPTION = "This package contains javadoc for aws-sdk-java."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-javadoc-1.11.3-7.9.noarch.rpm"
RPM_HASH = "67bd2605077af5686157b4bbd2c7fe4d149cda89ef13aea81ccf5db65bd6e05d36613bf40af707b5aaeb9a51bc0368c345227bdbbf510e0fdccd21a9292e2cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
