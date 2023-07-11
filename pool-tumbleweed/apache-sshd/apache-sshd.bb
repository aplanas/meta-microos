SUMMARY = "Apache SSHD"
DESCRIPTION = "Apache SSHD is a 100% pure java library to support the SSH protocols on both \
the client and server side."
LICENSE = "Apache-2.0 & ISC"

PV = "2.9.2"

RPM_NAME = "apache-sshd-2.9.2-2.4.noarch.rpm"
RPM_HASH = "2e9219c91e8ca0a0080a67ba5d46b97bc87774dcd3f6feb3b12482d717e503508691b60d7c5a9e0888556de0b2752b117ccaad136684dcbd5b9322ce25916f67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-sshd \
mvn-org.apache.sshd-sshd-common \
mvn-org.apache.sshd-sshd-common-pom- \
mvn-org.apache.sshd-sshd-core \
mvn-org.apache.sshd-sshd-core-pom- \
mvn-org.apache.sshd-sshd-osgi \
mvn-org.apache.sshd-sshd-osgi-pom- \
mvn-org.apache.sshd-sshd-pom- \
mvn-org.apache.sshd-sshd-putty \
mvn-org.apache.sshd-sshd-putty-pom- \
mvn-org.apache.sshd-sshd-scp \
mvn-org.apache.sshd-sshd-scp-pom- \
mvn-org.apache.sshd-sshd-sftp \
mvn-org.apache.sshd-sshd-sftp-pom- \
osgi-org.apache.sshd.osgi \
osgi-org.apache.sshd.putty \
osgi-org.apache.sshd.scp \
osgi-org.apache.sshd.sftp"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-jcl-over-slf4j \
mvn-org.slf4j-slf4j-api"

inherit rpm
