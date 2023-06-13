SUMMARY = "Tool for Converting XML Files to Various Formats"
DESCRIPTION = "This is a package for converting XML files to various formats using XSL \
stylesheets.  As a processor it depends on xsltproc and as a formatter \
for print output it makes use of passivetex."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.28"

RPM_NAME = "xmlto-0.0.28-3.14.aarch64.rpm"
RPM_HASH = "65fe4eab084e394ce9adce1494e83071d39315b9586ca9f31fe6896026096c1132b8ddca97fde00bb13fa350e76ffd600360137d1477ef0a46a1fc7621bde37c"

RPROVIDES:${PN} += "xmlto \
xmlto(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
docbook-xsl-stylesheets \
docbook_4 \
libc.so.6()(64bit) \
libxslt-tools"

inherit rpm
