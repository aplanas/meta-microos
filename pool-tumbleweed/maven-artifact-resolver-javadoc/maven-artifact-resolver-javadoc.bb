SUMMARY = "Javadoc for maven-artifact-resolver"
DESCRIPTION = "API documentation for maven-artifact-resolver."
LICENSE = "Apache-2.0"

PV = "1.0"

RPM_NAME = "maven-artifact-resolver-javadoc-1.0-3.11.noarch.rpm"
RPM_HASH = "d2dc98a5023b1b0f9e4947fc5cc5e365d2bf1ee1ef806927bc6aa0e5fdb7fbe5fd75b3eddc2cdb4975e98c4aa83072ceb48a9770249811bbce09f717b85af694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-artifact-resolver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
