SUMMARY = "Javadoc for reflectasm"
DESCRIPTION = "This package contains javadoc for reflectasm."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "reflectasm-javadoc-1.11.1-1.3.noarch.rpm"
RPM_HASH = "97ddbc712ed70b9a28debb77885060aa2e7d3aaac7c1aae0308c3664607ab6c3cde527f1c3ade371f2b3041ae5de305e64b12936926dad5710d3408161e0ee48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reflectasm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
