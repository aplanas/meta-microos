SUMMARY = "Javadoc for c3p0"
DESCRIPTION = "Javadoc documentation for c3p0."
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.5.5"

RPM_NAME = "c3p0-javadoc-0.9.5.5-4.9.noarch.rpm"
RPM_HASH = "c231442073348f2b71b9b93d495e935ba4fceb2fc4b233a10946ea3a0ed4d7b4615a1809e6e6c9ba82607c28748ef17b3cf72545dc202d024361526c53fd83f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "c3p0-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
