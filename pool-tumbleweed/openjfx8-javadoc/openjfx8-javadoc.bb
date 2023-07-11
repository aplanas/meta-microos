SUMMARY = "Javadoc for openjfx8"
DESCRIPTION = "This package contains javadoc for openjfx8."
LICENSE = "BSD-3-Clause & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "8.0.202"

RPM_NAME = "openjfx8-javadoc-8.0.202-8.4.noarch.rpm"
RPM_HASH = "6f6c4bb3c28a979b86387b193a5dd947ddec96ea35e4a0f801961034792966df67099aac6a50694283206bc7f54e8d159022d1258acc4ec4c65b725682139263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-1-8-0-openjfx-javadoc \
openjfx8-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
