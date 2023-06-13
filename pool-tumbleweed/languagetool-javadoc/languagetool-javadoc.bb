SUMMARY = "Javadoc for languagetool"
DESCRIPTION = "This package contains javadoc for languagetool."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-javadoc-4.8-3.1.noarch.rpm"
RPM_HASH = "efe3e22ec2598102baf8ec252ef4b1545fdb110f297a1dd1f80dae87245ba3781acf29968fc7af3c5d7343914ba7868eca875a30736a0154f89cf6f3f9165ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "languagetool-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
