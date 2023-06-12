SUMMARY = "Beans Binding (JSR 295) reference implementation"
DESCRIPTION = "In essence, Beans Binding (JSR 295) is about keeping two properties \
(typically of two objects) in sync. An additional emphasis is placed on \
the ability to bind to Swing components, and easy integration with IDEs \
such as NetBeans. This project provides the reference implementation."
LICENSE = "LGPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "beansbinding-1.2.1-29.11.noarch.rpm"
RPM_HASH = "f7160c39445aace0e7499b3928dc48b3cfc8a4c607ed34f31589d38567738f45a637ae6264f89015f51f45d5f175f5ee23cb9ac9136eec8e5e25229a22fc6e98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "beansbinding"
RDEPENDS:${PN} += "java"

inherit rpm
