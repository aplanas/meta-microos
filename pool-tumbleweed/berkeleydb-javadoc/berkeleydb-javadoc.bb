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

RPM_NAME = "berkeleydb-javadoc-5.0.58-12.17.noarch.rpm"
RPM_HASH = "6cb2d17b75516c8bdfa76a17d5d30c32c8e21788a6608c50e491e3f95b1cf6b4573102d60df0fce57ca5b6eda63fcfc6816c611e62a6829f7cfdc22976a67597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "berkeleydb-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
