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

RPM_NAME = "plantuml-1.2023.1-1.4.noarch.rpm"
RPM_HASH = "98fbd3b8b4cdb4b50e8a9e688529609b02dd3d497027b2c2fcc39a5b33b170b62b01f19d3b0250775ed54237e7a5f93dc6f84e5c0bd76c22b0aaa3ada2e7ca80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-net.sourceforge.plantuml-plantuml \
plantuml"

RDEPENDS:${PN} += "/usr/bin/bash \
java \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
