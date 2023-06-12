SUMMARY = "Documentation for gr-iqbal"
DESCRIPTION = "Documentation for gr-iqbal module for GNU Radio."
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "gr-iqbal-devel-doc-0.39.0git20210108-1.12.noarch.rpm"
RPM_HASH = "15a96f81cc534cac3d57617e3654441c3d78b53524c0d15b0581950b6d918a375e520116559ca0e7515fbc61d44c90361c1970f2aea92086499436147bd0126b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-iqbal-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
