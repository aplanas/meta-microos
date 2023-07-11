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

RPM_NAME = "berkeleydb-demo-5.0.58-12.17.noarch.rpm"
RPM_HASH = "b304bf19f99149d11a333ca63f11b275d087cfb09927a98841cf1fb93a6c8197f0b86bf3f82400b6de4d8d27d3f504cff32a6017cef9081d8f7feeb5d2f8dfb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "berkeleydb-demo"

RDEPENDS:${PN} += ""

inherit rpm
