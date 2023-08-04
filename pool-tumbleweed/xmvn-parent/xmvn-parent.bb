SUMMARY = "XMvn Parent POM"
DESCRIPTION = "This package provides XMvn parent POM."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-parent-4.2.0-4.1.noarch.rpm"
RPM_HASH = "2663b598cdb391ed7f310e649780e15848523a3e07c8aca563cb4a8518f25a1fba6c18d73915a6457523455a5572ece1bc3e81a8229b6b82d7995ae950c500aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-parent-pom- \
xmvn-parent \
xmvn-parent-pom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
