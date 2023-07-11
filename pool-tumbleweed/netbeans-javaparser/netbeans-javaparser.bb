SUMMARY = "NetBeans Java Parser"
DESCRIPTION = "Java parser to analyse Java source files inside of the NetBeans IDE"
LICENSE = "GPL-2.0-with-classpath-exception"

PV = "6.8"

RPM_NAME = "netbeans-javaparser-6.8-21.7.noarch.rpm"
RPM_HASH = "863440b35b1018cedf2d27cc3e823db96fbd117fa826ca988d14dff1ea7a06f0bdd4fc4b211ddfdfe7b8aab110ce2541962cdf970c8e1807377adffb0776cc75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbeans-javaparser"

RDEPENDS:${PN} += "java \
javapackages-tools"

inherit rpm
