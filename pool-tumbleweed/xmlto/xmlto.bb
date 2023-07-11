SUMMARY = "Tool for Converting XML Files to Various Formats"
DESCRIPTION = "This is a package for converting XML files to various formats using XSL \
stylesheets.  As a processor it depends on xsltproc and as a formatter \
for print output it makes use of passivetex."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.28"

RPM_NAME = "xmlto-0.0.28-3.15.aarch64.rpm"
RPM_HASH = "8785eecd934f9097fd1e68e76365acb1e51e46006f3c4480885bb13265ba2a8159ac8c7f4aaa0db841a1cac1299a9563991486f4ea56fe09168223b9c1513832"

RPROVIDES:${PN} += "xmlto"

RDEPENDS:${PN} += "/usr/bin/bash \
docbook-4 \
docbook-xsl-stylesheets \
libc.so.6 \
libxslt-tools"

inherit rpm
