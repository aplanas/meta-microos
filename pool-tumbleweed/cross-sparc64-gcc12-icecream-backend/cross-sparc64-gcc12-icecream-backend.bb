SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-sparc64-gcc12-icecream-backend-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "6689c7e2ec9f68edafe49e394e8a802a0611edb94374953e8295681470171f2203250fc2a0cd21f47ed91c31bca762bdd00c28ff8cbf9d132b99770527961dfa"

RPROVIDES:${PN} += "cross-sparc64-gcc12-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
