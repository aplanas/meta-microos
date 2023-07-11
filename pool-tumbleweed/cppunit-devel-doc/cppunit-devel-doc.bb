SUMMARY = "Documentation for the cppunit API"
DESCRIPTION = "This package contains documentation for the cppunit API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "cppunit-devel-doc-1.15.1-1.14.noarch.rpm"
RPM_HASH = "6b2fa9f5784d6d7409bbcb3765ce0acb58bcb87dbb0b2513abc5f7b2d4964868f9948a7047ec7e45f71c6c11489409e019826e4ef1572610dda211fc28b7788b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppunit-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
