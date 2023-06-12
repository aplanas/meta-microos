SUMMARY = "Programmer's text editor written in Java (Documentation)"
DESCRIPTION = "Javadoc for Programmer's text editor written in Java (Documentation)."
LICENSE = "GPL-2.0-or-later"

PV = "5.5.0"

RPM_NAME = "jedit-javadoc-5.5.0-5.9.noarch.rpm"
RPM_HASH = "7450eff717f94dfc967d59212d4cc847f091fabead27709bbab8da6040430913d45e61304d6f9ee6d1dd9c621356d0f94349e0f5406b3d85d341157f12e6a560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jedit-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
