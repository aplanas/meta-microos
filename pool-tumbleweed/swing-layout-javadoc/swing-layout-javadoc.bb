SUMMARY = "Natural layout for Swing panels"
DESCRIPTION = "Swing Layout Extensions goal is to make it easy to create \
   professional cross platform layouts with Swing. This project has \
   an eye towards the needs of GUI builders, such as NetBeans. This \
   project consists of the following pieces: * Ability to get the \
   baseline for components. \
 \
* Ability to get the preferred gap between components. \
 \
A new LayoutManager that utilizes both of these concepts and is tuned \
toward a free-form drag and drop layout model as can be provided by GUI \
builders."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "swing-layout-javadoc-1.0.3-37.7.noarch.rpm"
RPM_HASH = "3f65dc10d93e734d7aa06899788a3bf983545f0936d17757cb2f8afc844de3e6b506dbdccb99625c61701407448950fa34672dafb0078ab18dfe694636f34a33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swing-layout-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
