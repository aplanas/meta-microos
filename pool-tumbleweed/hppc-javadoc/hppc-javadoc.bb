SUMMARY = "Javadoc for HPPC"
DESCRIPTION = "This package contains javadoc for HPPC."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "hppc-javadoc-0.7.1-3.11.noarch.rpm"
RPM_HASH = "f8db48dc9608b37449c994ab6298a9eecc9cad1b99950a815955b1ce688788d8027dd5590c74a12ee73dddafcc8e57e91424e7d8a41d3b807fd7247ec79dc75b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hppc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
