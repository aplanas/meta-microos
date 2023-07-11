SUMMARY = "Programmer's text editor written in Java (Documentation)"
DESCRIPTION = "Javadoc for Programmer's text editor written in Java (Documentation)."
LICENSE = "GPL-2.0-or-later"

PV = "5.5.0"

RPM_NAME = "jedit-javadoc-5.5.0-5.10.noarch.rpm"
RPM_HASH = "38d44b8f7f5b63aa6a7d7d3e112c8c134cf32cb4e8ee6e7537faea3bdd9a0ba6565a7727bc588b93b616789cb9a662b4bd369ea142ff2e94d2447c10108f502c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jedit-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
