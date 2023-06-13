SUMMARY = "Javadoc for the Units of Measurement Libraries"
DESCRIPTION = "Javadoc for the Units of Measurement Libraries"
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "indriya-javadoc-1.3-3.9.noarch.rpm"
RPM_HASH = "d57994604e7a0b9d137d7e78437eade2bd67e29da5abf83539ea0f81617585f20697ff28ef4bc18ce3155cfb132083934817b1f3374b16ffee0cbb667d46a78e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "indriya-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
