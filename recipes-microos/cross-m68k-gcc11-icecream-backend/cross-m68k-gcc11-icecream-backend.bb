SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-m68k-gcc11-icecream-backend-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "e1d2426e7eaadb639bc476c6f7a13db81f5c4f60ea2398dd01bf386ebe7828360fffed6f2e160f5113ba99b48a9e1cc26e3090740aebd79ec613f58f962b4bd2"

RPROVIDES:${PN} += "cross-m68k-gcc11-icecream-backend cross-m68k-gcc11-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
