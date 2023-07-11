SUMMARY = "Beans Binding (JSR 295) reference implementation"
DESCRIPTION = "In essence, Beans Binding (JSR 295) is about keeping two properties \
(typically of two objects) in sync. An additional emphasis is placed on \
the ability to bind to Swing components, and easy integration with IDEs \
such as NetBeans. This project provides the reference implementation."
LICENSE = "LGPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "beansbinding-javadoc-1.2.1-29.12.noarch.rpm"
RPM_HASH = "339ad0d13eafcdd1430cf1438cfe9834bfd2198954aa25fe2321bed8d522febc2bd5c4fad67d1a951479bb7da63113b85c29a43524f1ccd1685c1f571d26c150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "beansbinding-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
