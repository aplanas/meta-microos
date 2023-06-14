SUMMARY = "Java project management and project comprehension tool"
DESCRIPTION = "Maven is a software project management and comprehension tool. Based on the \
concept of a project object model (POM), Maven can manage a project's build, \
reporting and documentation from a central piece of information."
LICENSE = "Apache-2.0 & MIT"

PV = "3.9.1"

RPM_NAME = "maven-3.9.1-2.1.aarch64.rpm"
RPM_HASH = "9eaf571dc8c7a221783a0a1358bc260db4074dab41cb0f377b65102a828311b6190c0cc094f01d65300bb7dc7e8855bf608b917b968458221ee49364a58da5f9"

RPROVIDES:${PN} += "maven"

RDEPENDS:${PN} += "aaa-base \
maven-lib"

inherit rpm
