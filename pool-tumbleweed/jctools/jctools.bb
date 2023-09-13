SUMMARY = "Java Concurrency Tools for the JVM"
DESCRIPTION = "This project aims to offer some concurrent data structures \
currently missing from the JDK: \
 \
* SPSC/MPSC/SPMC/MPMC Bounded lock free queues \
* SPSC/MPSC Unbounded lock free queues \
* Alternative interfaces for queues \
* Offheap concurrent ring buffer for ITC/IPC purposes \
* Single Writer Map/Set implementations \
* Low contention stats counters \
* Executor"
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "jctools-3.3.0-3.1.noarch.rpm"
RPM_HASH = "7f1c9c782acdc0d8d8ba7f77fb3a0c970698ffd391f72d7495910fc570ecd63548e63aed40bf7d63cace41dcdfe1ba5e8b6eaaba7a4334ea12e36dfc8c9e1496"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools \
mvn-org.jctools-jctools-core \
mvn-org.jctools-jctools-core-pom- \
osgi-org.jctools.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
