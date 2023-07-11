SUMMARY = "DAV protocol implementation"
DESCRIPTION = "kdav is a library providing a KJob-based implementation of DAV protocols such as \
CardDAV, WebDAV, and CalDAV."
LICENSE = "LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "kdav-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "d6ef89505ad74314f4a62cbb6688d74d043789c27a74704ee14782777c11864f7df0524c57eaa11126a4fbc29d833bb10aff0ade915bdf25741dd20ec7f86797"

RPROVIDES:${PN} += "kdav"

RDEPENDS:${PN} += ""

inherit rpm
