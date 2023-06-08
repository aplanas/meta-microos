SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-sparc64-gcc11-icecream-backend-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "9331c90b122d9356a6d2fcf2bb6c2deb173df7c570bc4d8a3848321fa60a2cefefb28afb567fa26ea570d1ae3576d6d85a741ee7654c6314c555c8e5d922472a"

RPROVIDES:${PN} += "cross-sparc64-gcc11-icecream-backend cross-sparc64-gcc11-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
