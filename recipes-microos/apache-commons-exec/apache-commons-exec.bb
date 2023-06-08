SUMMARY = "Java library to reliably execute external processes from within the JVM"
DESCRIPTION = "Commons Exec is a library for dealing with external process execution and \
environment management in Java."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "apache-commons-exec-1.3-2.6.noarch.rpm"
RPM_HASH = "047f50084d53ca274cdf7230ba4d7b4806aaa4202002056a5728da95545055a5507ee2239bdc8e21be9b112b34069709a3112d0abc15df724f666efd1daba9d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-exec mvn(org.apache.commons:commons-exec) mvn(org.apache.commons:commons-exec:pom:) osgi(org.apache.commons.commons-exec)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
