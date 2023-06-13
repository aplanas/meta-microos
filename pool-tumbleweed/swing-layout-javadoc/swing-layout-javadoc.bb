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

RPM_NAME = "swing-layout-javadoc-1.0.3-37.6.noarch.rpm"
RPM_HASH = "78a2d0685aaad16bf191ffb8fb565175c141e84cea64e08ac43b11f3fdfc05e3ee7d88f830a72f33ffeef87b88d4b5cf049f42e91719cb4b261d509b17cead70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swing-layout-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
