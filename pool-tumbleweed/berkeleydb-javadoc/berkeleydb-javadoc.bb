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

RPM_NAME = "berkeleydb-javadoc-5.0.58-12.16.noarch.rpm"
RPM_HASH = "0b1dba291ee4d1ba85c058996b81a7d5c0ab43a66a0e8d15a4df05026c92bbcb30e9da69b7b61815a233c3d07add4dac6d363d85396c699c8af914c92c715c59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "berkeleydb-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
