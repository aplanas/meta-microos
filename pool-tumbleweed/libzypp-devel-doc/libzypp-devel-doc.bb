SUMMARY = "Developer documentation for libzypp"
DESCRIPTION = "Developer documentation for libzypp."
LICENSE = "GPL-2.0-or-later"

PV = "17.31.20"

RPM_NAME = "libzypp-devel-doc-17.31.20-1.1.aarch64.rpm"
RPM_HASH = "00376b516057408311ad8c93b3bf543a2b81485f3eea6f9754792aaa7fe176f819be89b83ec3475fb451e9ce58740e498c719d4203135808031fb472df5fd5d2"

RPROVIDES:${PN} += "libzypp-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
