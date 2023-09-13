SUMMARY = "Javadoc for jcsp"
DESCRIPTION = "This package contains javadoc for jcsp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1~rc5"

RPM_NAME = "jcsp-javadoc-1.1~rc5-4.1.noarch.rpm"
RPM_HASH = "491896ef6b8e56bd811407dbbac8e10b430f398815c3a810c316407dff79d024cde28405fcbd9475871f2ceb9c259abe9612930ae810b8caf51005108c1b55a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcsp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
