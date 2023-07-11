SUMMARY = "Base64 encoder/decoder Java library"
DESCRIPTION = "Base64Coder is a Base64 encoder/decoder class. \
 \
There is no Base64 encoder/decoder in the standard Java SDK class \
library.  The undocumented classes sun.misc.BASE64Encoder and \
sun.misc.BASE64Decoder should not be used."
LICENSE = "EPL-1.0 | EPL-2.0 | LGPL-2.1-or-later | GPL-2.0-or-later | Apache-2.0 | BSD-2-Clause"

PV = "20101219"

RPM_NAME = "base64coder-20101219-2.16.noarch.rpm"
RPM_HASH = "ccd85cc86b66a469235edfa376b6b244d9ab27ae6ef4829ac6951a06818a3369e3b02362f87153a19160121e6d21c2a7189af5cc20d5da0adbccee387e07e8af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "base64coder \
mvn-biz.source-code-base64coder \
mvn-biz.source-code-base64coder-pom- \
osgi-biz.source-code.base64coder"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
