SUMMARY = "XML Schema Object Model (XSOM)"
DESCRIPTION = "XML Schema Object Model (XSOM) is a Java library that allows applications to \
easily parse XML Schema documents and inspect information in them. It is \
expected to be useful for applications that need to take XML Schema as an \
input.  The library is a straight-forward implement of 'schema components' as \
defined in the XML Schema spec part 1.  Refer to this specification of how this \
object model works."
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "0~20140925"

RPM_NAME = "xsom-0~20140925-4.4.noarch.rpm"
RPM_HASH = "456e08d4de4e9bc5d849503c38bf0365071822b82a539f1d8a2c9b7adf3666f795ea19f0e7e3237c6df0e1f7cba5019ad75768b8b7614f932cfca76de07029d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.sun.xsom:xsom) \
mvn(com.sun.xsom:xsom:pom:) \
xsom"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(relaxngDatatype:relaxngDatatype)"

inherit rpm
