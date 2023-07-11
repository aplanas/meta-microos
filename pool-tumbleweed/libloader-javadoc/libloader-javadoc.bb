SUMMARY = "Javadoc for libloader"
DESCRIPTION = "Javadoc for libloader."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libloader-javadoc-1.1.6-1.5.noarch.rpm"
RPM_HASH = "42b15fecd115e82bebece5c0b25668776045f39e0a089e8328ed75545ecbd46edc3de3ee691a117f585f67fd0fb9432cc0708b52f384d4e37d8177ce8687c4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libloader-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
