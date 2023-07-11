SUMMARY = "Java bytecode manipulation framework"
DESCRIPTION = "ASM is a Java bytecode manipulation framework. \
 \
It can be used to dynamically generate stub classes or other proxy \
classes, directly in binary form, or to dynamically modify classes at \
load time, i.e., just before they are loaded into the Java Virtual \
Machine. \
 \
ASM offers similar functionalities as BCEL or SERP, but is much \
smaller."
LICENSE = "BSD-3-Clause"

PV = "9.5"

RPM_NAME = "objectweb-asm-javadoc-9.5-1.2.noarch.rpm"
RPM_HASH = "ff1447933ee180e292069014fa73fd95eeaa241e8f13415f5d419566aaae625382d50bb3451e54dde7856347befbb6ed6dbd16d5427a44f8d3ee2fd13407e075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "objectweb-asm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
