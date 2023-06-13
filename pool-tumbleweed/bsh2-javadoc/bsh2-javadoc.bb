SUMMARY = "Javadoc for bsh2"
DESCRIPTION = "Scripting for Java (BeanShell Version 2.x) (Java Documentation)."
LICENSE = "LGPL-2.0-or-later | SPL-1.0"

PV = "2.1.1"

RPM_NAME = "bsh2-javadoc-2.1.1-1.1.noarch.rpm"
RPM_HASH = "3d882516b0bcf430ef6789f11acd80207971118c6163da7fd863a55add2230df4ca778d9333cd50ce82942a2fc33aa953023ffd893abbb39f3d7075aaf2ddcba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsh2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
