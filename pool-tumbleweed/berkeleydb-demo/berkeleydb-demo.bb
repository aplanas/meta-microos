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

RPM_NAME = "berkeleydb-demo-5.0.58-12.16.noarch.rpm"
RPM_HASH = "5ff7777b8931147584eb96fa32179944ca3cbe983440fc71d071ad18ec4d8c72189662103218d530de2bbd56f71ac7bf2464cc7e18fc103d97073657dcafc7d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "berkeleydb-demo"
RDEPENDS:${PN} += ""

inherit rpm
