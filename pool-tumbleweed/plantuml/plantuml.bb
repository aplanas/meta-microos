SUMMARY = "Java UML Tool"
DESCRIPTION = "PlantUML is a program allowing to draw UML diagrams, using a simple \
and human readable text description. It is extremely useful for code \
documenting, sketching project architecture during team conversations \
and so on. \
 \
PlantUML supports the following diagram types \
  - sequence diagram \
  - use case diagram \
  - class diagram \
  - activity diagram \
  - component diagram \
  - state diagram"
LICENSE = "GPL-3.0-or-later"

PV = "1.2023.1"

RPM_NAME = "plantuml-1.2023.1-1.3.noarch.rpm"
RPM_HASH = "768ce7a42f4d2de10b6eada30e265f99632cf7452ea159cdc0624bedc0b35d9bb95ea572e086952492724b1532db1f5daa7d1db84a492fd28379fcca9b6497c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-net.sourceforge.plantuml-plantuml \
plantuml"

RDEPENDS:${PN} += "/bin/bash \
java \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
