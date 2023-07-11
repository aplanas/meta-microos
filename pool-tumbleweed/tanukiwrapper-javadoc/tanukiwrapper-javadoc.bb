SUMMARY = "Javadoc documentation for tanukiwrapper"
DESCRIPTION = "This package contains the javadoc documentation for tanukiwrapper"
LICENSE = "GPL-2.0-only"

PV = "3.5.35"

RPM_NAME = "tanukiwrapper-javadoc-3.5.35-2.7.aarch64.rpm"
RPM_HASH = "41821d00f284066af1fb4a41deba1d553dd5ffbdc32c3bb953df004240724b42637ba69a441f7b40ccf23bdec592463252c531f0f19fb1adf1a9fd1060232d64"

RPROVIDES:${PN} += "tanukiwrapper-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
