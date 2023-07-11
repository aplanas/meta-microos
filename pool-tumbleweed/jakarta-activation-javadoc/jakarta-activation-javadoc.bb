SUMMARY = "Javadoc for jakarta-activation"
DESCRIPTION = "This package contains javadoc for jakarta-activation."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "jakarta-activation-javadoc-2.1.0-2.7.noarch.rpm"
RPM_HASH = "32b3d0382cf573a3c1898361a99db33622b2793871390660a196d533f0591f858b882c48554b48f20fa69bd3acb084c0280d6bcc756263df99ff9f427c04050e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-activation-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
