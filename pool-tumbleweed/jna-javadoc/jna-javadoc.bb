SUMMARY = "Javadocs for jna"
DESCRIPTION = "This package contains the javadocs for jna."
LICENSE = "Apache-2.0 | LGPL-2.1-or-later"

PV = "5.13.0"

RPM_NAME = "jna-javadoc-5.13.0-1.1.noarch.rpm"
RPM_HASH = "12dc19dd4bf98636f6e4e0b3ef05d4da0894fdc44c3b497c9275ed14754618e1a59853cf7e7fd066b56af544dff7b15ae49f9690d25d7a193176558354614498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jna-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
