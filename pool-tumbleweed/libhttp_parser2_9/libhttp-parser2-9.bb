SUMMARY = "HTTP request/response parser for C"
DESCRIPTION = "This is a parser for HTTP messages written in C. It parses both \
requests and responses. The parser is designed to be used in \
performance HTTP applications. It does not make any syscalls nor \
allocations, it does not buffer data, it can be interrupted at \
anytime. Depending on your architecture, it only requires about 40 \
bytes of data per message stream (in a web server that is per \
connection)."
LICENSE = "MIT"

PV = "2.9.4"

RPM_NAME = "libhttp_parser2_9-2.9.4-1.12.aarch64.rpm"
RPM_HASH = "213a81f86818a81c00a59f7c92c1a613acc05307c9bbad2fb7af51b06107ceb88cbe23fa6b997e92ba929eb75fb2e263477bd35c9903ac619723ad8a91a655e3"

RPROVIDES:${PN} += "libhttp-parser-suse0 \
libhttp-parser.so.2.9 \
libhttp-parser2-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
