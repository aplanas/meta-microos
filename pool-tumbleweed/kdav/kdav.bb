SUMMARY = "DAV protocol implementation"
DESCRIPTION = "kdav is a library providing a KJob-based implementation of DAV protocols such as \
CardDAV, WebDAV, and CalDAV."
LICENSE = "LGPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "kdav-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "e6c263690bbbf5ae004050cf092de59a8dfe907476f298e7cd1f61ac0efb5146744215af1b5445b11461d4fa3418af7c06fb0db8190d365328c0705fa1bd33ff"

RPROVIDES:${PN} += "kdav"

RDEPENDS:${PN} += ""

inherit rpm
