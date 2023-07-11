SUMMARY = "Another Tool for Language Recognition"
DESCRIPTION = "ANTLR, Another Tool for Language Recognition, (formerly PCCTS) is a \
language tool that provides a framework for constructing recognizers, \
compilers, and translators from grammatical descriptions containing C++ \
or Java actions (you can use PCCTS 1.xx to generate C-based parsers)."
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain & MIT"

PV = "2.7.7"

RPM_NAME = "antlr-2.7.7-122.2.aarch64.rpm"
RPM_HASH = "849b0c8ca223cd4755cc286c8d99095e72f2438c67c371dc8e817c6a3b65027e8b1de5ef7fda529b65756eab3ed8a81fd4b2116186b9384b0d7b966841034745"

RPROVIDES:${PN} += "antlr \
antlr-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
antlr-java"

inherit rpm
