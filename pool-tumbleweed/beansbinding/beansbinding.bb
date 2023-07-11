SUMMARY = "Beans Binding (JSR 295) reference implementation"
DESCRIPTION = "In essence, Beans Binding (JSR 295) is about keeping two properties \
(typically of two objects) in sync. An additional emphasis is placed on \
the ability to bind to Swing components, and easy integration with IDEs \
such as NetBeans. This project provides the reference implementation."
LICENSE = "LGPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "beansbinding-1.2.1-29.12.noarch.rpm"
RPM_HASH = "e1c961efad0af7ff646431f0f977ab32d10578db4071f91ee55e522035012fe4ecd314d8158be0dee0fcc36b2ed6dfccb30df4769426467ba4795cdd4743eb8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "beansbinding"

RDEPENDS:${PN} += "java"

inherit rpm
