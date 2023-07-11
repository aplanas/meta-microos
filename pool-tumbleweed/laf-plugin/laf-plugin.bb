SUMMARY = "Generic plugin framework for Java look-and-feels"
DESCRIPTION = "The goal of this project is to provide a small infrastructure that \
provides plugin mechanism for third-party components in look-and-feel \
libraries."
LICENSE = "BSD-3-Clause & Zlib"

PV = "1.0"

RPM_NAME = "laf-plugin-1.0-7.7.noarch.rpm"
RPM_HASH = "85c396ee720e1db256bfe6c6498885b7b400795e0ad25896167db6277a31820d6ed1b6696873799edc2a1f9e55b53cc280bfc6773e7727805da2ad69b4fe7b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "laf-plugin"

RDEPENDS:${PN} += "java \
jpackage-utils"

inherit rpm
