SUMMARY = "Base64 encoder/decoder Java library"
DESCRIPTION = "Base64Coder is a Base64 encoder/decoder class. \
 \
There is no Base64 encoder/decoder in the standard Java SDK class \
library.  The undocumented classes sun.misc.BASE64Encoder and \
sun.misc.BASE64Decoder should not be used."
LICENSE = "EPL-1.0 | EPL-2.0 | LGPL-2.1-or-later | GPL-2.0-or-later | Apache-2.0 | BSD-2-Clause"

PV = "20101219"

RPM_NAME = "base64coder-20101219-2.15.noarch.rpm"
RPM_HASH = "6cc53614ee9bb7e0febd4c81d398aa3ef561e95f9c9ba6efc44ad13b5ae6755f8c912430b307a7159f1d28b09cff728a7a452d1d3874829d1a9995971580dc9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "base64coder mvn(biz.source_code:base64coder) mvn(biz.source_code:base64coder:pom:) osgi(biz.source_code.base64coder)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
