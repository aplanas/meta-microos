SUMMARY = "Javadoc for jboss-logmanager"
DESCRIPTION = "This package contains the API documentation for jboss-logmanager."
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "jboss-logmanager-javadoc-2.0.4-2.1.noarch.rpm"
RPM_HASH = "633f660c73e293341474301263682a7f99b3eefd0094e3450b54ecca58b597776586c15169f6bd98f46e6015012d20d4faa7c70e3e519b5265e8b30c0766152b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logmanager-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
