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

RPM_NAME = "swing-layout-1.0.3-37.7.noarch.rpm"
RPM_HASH = "4b50060f76c0b5d6b72f8b4d6bd660f21609c44513d8b6f799477308210d5ed50578f7b57d66ad2e52560860e92b6ab11e576286fc06328eae58cf11b3b546b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swing-layout"

RDEPENDS:${PN} += "java"

inherit rpm
