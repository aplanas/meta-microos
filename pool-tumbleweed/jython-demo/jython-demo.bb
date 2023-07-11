SUMMARY = "Demonstration and samples for jython"
DESCRIPTION = "Demonstrations and samples for jython."
LICENSE = "Apache-2.0 & Python-2.0"

PV = "2.7.3"

RPM_NAME = "jython-demo-2.7.3-1.1.noarch.rpm"
RPM_HASH = "38f92827a7d911430d55a73cfbc040cc1ba337b9ce7f1953855212f71444bd9db2192dc581ffad85b9ee2018ebb711d481307022ef1d429fd86dbf52620253ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jython-demo"

RDEPENDS:${PN} += "jython"

inherit rpm
