SUMMARY = "Javadoc for languagetool"
DESCRIPTION = "This package contains javadoc for languagetool."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-javadoc-4.8-3.2.noarch.rpm"
RPM_HASH = "497b1063e793a0f59a559848485986af9027e8793cc6152e12465ed433220b6132e50a09b1235888b40d962e0b2b2d21e0841810917e07f525d23e7d574abd3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "languagetool-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
