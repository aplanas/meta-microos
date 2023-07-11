SUMMARY = "XML Schema Object Model (XSOM)"
DESCRIPTION = "XML Schema Object Model (XSOM) is a Java library that allows applications to \
easily parse XML Schema documents and inspect information in them. It is \
expected to be useful for applications that need to take XML Schema as an \
input.  The library is a straight-forward implement of 'schema components' as \
defined in the XML Schema spec part 1.  Refer to this specification of how this \
object model works."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "0~20140925"

RPM_NAME = "xsom-0~20140925-4.5.noarch.rpm"
RPM_HASH = "eddd6ae10bbe38ed766d40611bd00d83567011333bef40e0c282be1026df905a8a2c4df5f295c86565e5b9559b20bfb1d262aed9169989a6b9db112671da0830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.sun.xsom-xsom \
mvn-com.sun.xsom-xsom-pom- \
xsom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-relaxngDatatype-relaxngDatatype"

inherit rpm
