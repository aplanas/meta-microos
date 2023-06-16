SUMMARY = "HTML DTDs (Document Type Definitions) and Documents"
DESCRIPTION = "Document Type Definitions (DTDs) for HTML 2.0, HTML 3.2, HTML 4.0, and \
HTML 4.01.  This package also contains the documentation (located in \
/usr/share/doc/packages/html-dtd)."
LICENSE = "W3C-19980720"

PV = "2004.1.26"

RPM_NAME = "html-dtd-2004.1.26-230.14.noarch.rpm"
RPM_HASH = "4bba3e7f4ac14a28e44debb120e1529fbecb0acba9fc4ef270b4e8a16b88adc2c1a6161396550cb80270bacdc1743594d050c489e7567b726d240e222f304f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-html-dtd \
html-dtd"

RDEPENDS:${PN} += "/usr/bin/sgml-register-catalog \
/usr/bin/sh"

inherit rpm
