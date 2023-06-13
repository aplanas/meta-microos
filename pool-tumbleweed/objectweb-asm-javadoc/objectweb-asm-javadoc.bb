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

RPM_NAME = "objectweb-asm-javadoc-9.5-1.1.noarch.rpm"
RPM_HASH = "e22afae4bd1f9fb1e9637587938a2c6743d1877f098eef1694e9f54bbf79f398259297b2f14fa9080a1d02d0c782884d1c9ade97fbcf8ca325890c2af1ab5d88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "objectweb-asm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
