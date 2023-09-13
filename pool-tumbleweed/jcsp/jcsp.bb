SUMMARY = "Communicating Sequential Processes for Java (JCSP)"
DESCRIPTION = "JCSP (Communication Sequential Processes for Java) is a \
library providing a concurrency model that is a combination \
of ideas from Hoare's CSP and Milner's pi-calculus. \
 \
Communicating Sequential Processes (CSP) is a mathematical \
theory for specifying and verifying complex patterns of \
behavior arising from interactions between concurrent \
objects. \
 \
JCSP provides a base range of CSP primitives plus a rich set of \
extensions. Also included is a package providing CSP process \
wrappers giving a channel interface to all Java AWT widgets \
and graphics operations.  It is extensively (java/documented) \
and includes much teaching. \
 \
JCSP is an alternative concurrency model to the threads and \
mechanisms built into Java. It is also compatible with \
it since it is implemented on top of it."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1~rc5"

RPM_NAME = "jcsp-1.1~rc5-4.1.noarch.rpm"
RPM_HASH = "54a267c82634581fc1513a046b00790ca92b1d78eedb842da6e87df308fbeca9daf3a22751aa56dafc706f9b47eecec61be619aac9d435f2c5a7bb98997aaa32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcsp \
mvn-org.codehaus.jcsp-jcsp \
mvn-org.codehaus.jcsp-jcsp-pom- \
osgi-org.codehaus.jcsp"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.osgi-osgi.core"

inherit rpm
