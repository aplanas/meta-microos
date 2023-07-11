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

RPM_NAME = "jctools-3.3.0-2.11.noarch.rpm"
RPM_HASH = "7487513af413b8a0cb2f1c7f322b38f35bbb3902ca01d5f075660972cba5ee159d118070e615ab0f59ebc7ad91e4cf2997b0894bf54185ed21be4a41f30c141a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools \
mvn-org.jctools-jctools-core \
mvn-org.jctools-jctools-core-pom- \
osgi-org.jctools.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
