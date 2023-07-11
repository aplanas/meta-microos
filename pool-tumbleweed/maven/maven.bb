SUMMARY = "Java project management and project comprehension tool"
DESCRIPTION = "Maven is a software project management and comprehension tool. Based on the \
concept of a project object model (POM), Maven can manage a project's build, \
reporting and documentation from a central piece of information."
LICENSE = "Apache-2.0 & MIT"

PV = "3.9.2"

RPM_NAME = "maven-3.9.2-1.1.aarch64.rpm"
RPM_HASH = "2006c566f76391514e83232a4e371446b3fc36448c2a1d29766d826a6e6c28c97fefb832e1cb97f782b84fb0e72c58e7eaefa9ca44956adc9e06e3d29bfaa0ef"

RPROVIDES:${PN} += "maven"

RDEPENDS:${PN} += "aaa-base \
maven-lib"

inherit rpm
