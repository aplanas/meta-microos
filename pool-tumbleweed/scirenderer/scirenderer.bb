SUMMARY = "A Java rendering library based on JoGL"
DESCRIPTION = "SciRenderer is a rendering library based on JoGL. This Java API allows \
2-D or 3-D plotting from simple 2-D graph to complex scenes. Independent \
library, SciRender is used within Scilab software but is available \
for other application and developments."
LICENSE = "CECILL-2.0"

PV = "1.1.0"

RPM_NAME = "scirenderer-1.1.0-6.7.noarch.rpm"
RPM_HASH = "778c7892a84a93ffd62940dddbebd3dee95769a1a2c0ccac3f6947a35e0d91b5a9648f2ba8c32a6932412848586ada1b4e1d5ce1fe3d87eb5d7011da6820a914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scirenderer"

RDEPENDS:${PN} += "java \
jpackage-utils"

inherit rpm
