SUMMARY = "Javadoc for jakarta-commons-modeler"
DESCRIPTION = "The Modeler project shall create and maintain a set of Java classes to \
provide the facilities described in the preceeding section, plus unit \
tests and small examples of using these facilities to instrument Java \
classes with Model MBean support. \
 \
This package contains the javadoc documentation for the Jakarta Commons \
Modeler Package."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "jakarta-commons-modeler-javadoc-2.0.1-3.1.noarch.rpm"
RPM_HASH = "5edd508428e4dedd3b0fdc31ecc09276eb36e4d51c6d84782551d6a936c11a84945f46e4f93cb3005dd54996af069a45c1a759f7fc73badfd133d3fffb5b0d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-modeler-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
