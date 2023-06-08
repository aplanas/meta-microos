SUMMARY = "Apache SSHD"
DESCRIPTION = "Apache SSHD is a 100% pure java library to support the SSH protocols on both \
the client and server side."
LICENSE = "Apache-2.0 & ISC"

PV = "2.9.2"

RPM_NAME = "apache-sshd-2.9.2-2.3.noarch.rpm"
RPM_HASH = "818443f5a6b816682c7179883230dc48a897fff6a55f06d011aac8498b2c5bde2ec6a49af33a659b4c8eb24c411cc0577b9df793f701e062c5f870489723ea42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-sshd mvn(org.apache.sshd:sshd-common) mvn(org.apache.sshd:sshd-common:pom:) mvn(org.apache.sshd:sshd-core) mvn(org.apache.sshd:sshd-core:pom:) mvn(org.apache.sshd:sshd-osgi) mvn(org.apache.sshd:sshd-osgi:pom:) mvn(org.apache.sshd:sshd-putty) mvn(org.apache.sshd:sshd-putty:pom:) mvn(org.apache.sshd:sshd-scp) mvn(org.apache.sshd:sshd-scp:pom:) mvn(org.apache.sshd:sshd-sftp) mvn(org.apache.sshd:sshd-sftp:pom:) mvn(org.apache.sshd:sshd:pom:) osgi(org.apache.sshd.osgi) osgi(org.apache.sshd.putty) osgi(org.apache.sshd.scp) osgi(org.apache.sshd.sftp)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.slf4j:jcl-over-slf4j) mvn(org.slf4j:slf4j-api)"

inherit rpm
