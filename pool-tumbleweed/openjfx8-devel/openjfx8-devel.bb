SUMMARY = "OpenJFX development tools and libraries"
DESCRIPTION = "OpenJFX development tools and libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "8.0.202"

RPM_NAME = "openjfx8-devel-8.0.202-8.4.aarch64.rpm"
RPM_HASH = "178f73e82dd0440fa2cffcc0c3ddb9f6ca1f65b327ee6c0ff498383d394541f0b0e75364f9d6c3dee90a950ba1745bf214bb9c9a33e7c4b9397fe6df6e139ffd"

RPROVIDES:${PN} += "java-1-8-0-openjfx-devel \
openjfx8-devel"

RDEPENDS:${PN} += "java-devel \
openjfx8"

inherit rpm
