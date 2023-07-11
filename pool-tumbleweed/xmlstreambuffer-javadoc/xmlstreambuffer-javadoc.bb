SUMMARY = "Javadoc for xmlstreambuffer"
DESCRIPTION = "This package contains javadoc for xmlstreambuffer."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.5.4"

RPM_NAME = "xmlstreambuffer-javadoc-1.5.4-3.5.noarch.rpm"
RPM_HASH = "44c52ed99552562f5ab7bd035ba3321d1151b672f0310f05a8a2fd250f837b32d57151cc406421b42984547223851c359d9a61787563f5786e49d96aaf7130e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlstreambuffer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
