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

RPM_NAME = "berkeleydb-5.0.58-12.16.noarch.rpm"
RPM_HASH = "4d5f766e7f717b550d54301d86c694fb0920cc2b3ece2e1e670d80bd934d3bf6bff7138625c9977110bff352ca4143cb36b11d05d5e217482498f239cff7a31b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "berkeleydb"
RDEPENDS:${PN} += "j2ee-connector \
java"

inherit rpm
