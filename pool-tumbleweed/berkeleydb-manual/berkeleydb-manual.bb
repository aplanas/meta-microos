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

RPM_NAME = "berkeleydb-manual-5.0.58-12.16.noarch.rpm"
RPM_HASH = "dba5c544423f911c1867c553afe37c47bfe5fbfdb9c598589e15eb53d8ee603e286e6c0f2c4c632aaae4d2242f0afecb60cc6eb23011bbc570e56a9c6588baed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "berkeleydb-manual"
RDEPENDS:${PN} += ""

inherit rpm
