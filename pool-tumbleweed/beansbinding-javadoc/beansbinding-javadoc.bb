SUMMARY = "Beans Binding (JSR 295) reference implementation"
DESCRIPTION = "In essence, Beans Binding (JSR 295) is about keeping two properties \
(typically of two objects) in sync. An additional emphasis is placed on \
the ability to bind to Swing components, and easy integration with IDEs \
such as NetBeans. This project provides the reference implementation."
LICENSE = "LGPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "beansbinding-javadoc-1.2.1-29.11.noarch.rpm"
RPM_HASH = "0e8fcebb9427f6e7b77d09d705ea433126feff1df05078fff32e14bcdbe3ab0504ec6aafb57e4a179a5c2169c1f523b85a0c8af0a90d47ee2f29dc0e14ad0c02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "beansbinding-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
