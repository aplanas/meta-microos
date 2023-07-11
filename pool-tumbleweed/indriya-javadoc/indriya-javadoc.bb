SUMMARY = "Javadoc for the Units of Measurement Libraries"
DESCRIPTION = "Javadoc for the Units of Measurement Libraries"
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "indriya-javadoc-1.3-3.10.noarch.rpm"
RPM_HASH = "7e03895a5323f7d77fc13dc9b99d91abd67c90aace899559c699d3c9c96ee12137c6effd14debb1d8dc8ec46650f4522ff6b3307a89adb7cef98fe04cc9ae753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "indriya-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
