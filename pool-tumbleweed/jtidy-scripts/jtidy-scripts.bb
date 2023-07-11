SUMMARY = "HTML syntax checker and pretty printer"
DESCRIPTION = "JTidy is a Java port of HTML Tidy, a HTML syntax checker and pretty \
printer. Like its non-Java cousin, JTidy can be used as a tool for \
cleaning up malformed and faulty HTML. In addition, JTidy provides a \
DOM parser for real-world HTML."
LICENSE = "BSD-3-Clause"

PV = "8.0"

RPM_NAME = "jtidy-scripts-8.0-30.7.noarch.rpm"
RPM_HASH = "310bc9afae5df1cd4f76c1857bf003af3094729d9a8666dce95fbaccec57c305e8bcc4debb4a5a7f43f8f7c7f55f4e804bcae4c40baad3ef6339fdd256bc8717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jtidy-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
javapackages-tools \
jtidy"

inherit rpm
