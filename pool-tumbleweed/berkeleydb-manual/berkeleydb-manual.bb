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

RPM_NAME = "berkeleydb-manual-5.0.58-12.17.noarch.rpm"
RPM_HASH = "2982415f33f67da2b372dd3f42aea4929bdba3f700b911b77e8ef5a15b70033caaa48141e93033f47f2aa42a909827f4a483bfdafc5ecfaa840cdc82bc12dac7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "berkeleydb-manual"

RDEPENDS:${PN} += ""

inherit rpm
