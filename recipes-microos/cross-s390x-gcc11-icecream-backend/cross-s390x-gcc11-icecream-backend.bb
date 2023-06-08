SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-s390x-gcc11-icecream-backend-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "1b212bdf9d83d8e48c356779d0594cab2304460c0a12e00a6fc3de155420009835d6139ac4d6b3893c9fb18c22ad8fcc63af0e029ba0c5c0b054bc9a2e6b176b"

RPROVIDES:${PN} += "cross-s390x-gcc11-icecream-backend cross-s390x-gcc11-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
