SUMMARY = "Java project management and project comprehension tool"
DESCRIPTION = "Maven is a software project management and comprehension tool. Based on the \
concept of a project object model (POM), Maven can manage a project's build, \
reporting and documentation from a central piece of information."
LICENSE = "Apache-2.0 & MIT"

PV = "3.9.2"

RPM_NAME = "maven-3.9.2-2.1.aarch64.rpm"
RPM_HASH = "d6b2b51b563ac564fc107612f8489f2c28e422c8c97490e56ebd19e03b5803ec60b082bd2202acc3171dabe9cbf47eb13d68c8537aaad890907917ffa28cbfea"

RPROVIDES:${PN} += "maven"

RDEPENDS:${PN} += "aaa-base \
maven-lib"

inherit rpm
