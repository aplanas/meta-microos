SUMMARY = "Berkeley DB Java Edition"
DESCRIPTION = "Berkeley DB Java Edition is a high performance, transactional storage \
engine written entirely in Java. Like the highly successful Berkeley DB \
product, Berkeley DB Java Edition executes in the address space of the \
application, without the overhead of client/server communication. It \
stores data in the application's native format, so no runtime data \
translation is required. Berkeley DB Java Edition supports full ACID \
transactions and recovery. It provides an easy-to-use, programmatic \
interface, allowing developers to store and retrieve information \
quickly, simply and reliably."
LICENSE = "Sleepycat"

PV = "5.0.58"

RPM_NAME = "berkeleydb-5.0.58-12.17.noarch.rpm"
RPM_HASH = "92efeb21347192bdf419bd2d000e4c5c4261da77dd0caf916802fd4828d27374ac2bfbd5184808b67d3c6d4ad01fc45f17f02ba4f20bed1f75f1713d3178c09a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "berkeleydb"

RDEPENDS:${PN} += "j2ee-connector \
java"

inherit rpm
