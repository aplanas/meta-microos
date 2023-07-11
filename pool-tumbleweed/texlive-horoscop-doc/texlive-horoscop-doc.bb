SUMMARY = "Documentation for texlive-horoscop"
DESCRIPTION = "This package includes the documentation for texlive-horoscop"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.01svn56021"

RPM_NAME = "texlive-horoscop-doc-2023.201.1.01svn56021-53.2.noarch.rpm"
RPM_HASH = "4c0aa9c95c044b41d72370c558afc59ddc7dcab8cdeaa9c19ace8d524a32997f2bd735750fbc82c398d60f383ea1ab519939f8f0408cd3720d34955d3edce51b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-horoscop-doc"

RDEPENDS:${PN} += ""

inherit rpm
