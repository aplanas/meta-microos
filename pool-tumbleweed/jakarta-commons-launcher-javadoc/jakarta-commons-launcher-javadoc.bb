SUMMARY = "Javadoc for jakarta-commons-launcher"
DESCRIPTION = "Commons-launcher eliminates the need for a batch or shell script to \
launch a Java class. \
 \
This package contains the javadoc documentation for the Jakarta Commons \
Launcher Package."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "jakarta-commons-launcher-javadoc-1.1-25.7.noarch.rpm"
RPM_HASH = "964b53fea4ffe064b5c51b9a067ff72b869335b76b6b773d0a722a5a2abcf11b9605351747cb0bf6ad9d1c3fbaeda0a3abd1c9404601977da28121afde755b64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-launcher-javadoc"

RDEPENDS:${PN} += "coreutils"

inherit rpm
