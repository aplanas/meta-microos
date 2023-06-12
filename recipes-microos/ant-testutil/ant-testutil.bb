SUMMARY = "Test utility classes for ant"
DESCRIPTION = "Test utility tasks for ant-antlr."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-testutil-1.10.13-2.1.noarch.rpm"
RPM_HASH = "d87a8bc1a7362abe7130d293e5d0ee498da1d10dc4e7fa392de732a5d1a69538d8b5c2050372f64dc88b4488677063d76bfa826439e3064bf2cf515be29cfc3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-testutil \
config(ant-testutil) \
mvn(org.apache.ant:ant-testutil) \
mvn(org.apache.ant:ant-testutil:pom:)"
RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
junit4 \
mvn(junit:junit) \
mvn(org.apache.ant:ant)"

inherit rpm
