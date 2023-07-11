SUMMARY = "ANother Tool for Language Recognition (c++ runtime)"
DESCRIPTION = "ANTLR, Another Tool for Language Recognition, (formerly PCCTS) is a \
language tool that provides a framework for constructing recognizers, \
compilers, and translators from grammatical descriptions containing C++ \
or Java actions (you can use PCCTS 1.xx to generate C-based parsers). \
 \
This package provides the C++ runtime (libantlr.a) and a headers files \
of antlr"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain & MIT"

PV = "2.7.7"

RPM_NAME = "antlr-devel-2.7.7-122.2.aarch64.rpm"
RPM_HASH = "1f6955b39ea88cf3975c3bd6869d0a9579f920228ee6365f7624bdb10d56b933c55d95fd8432eed8549f293e8e200a06ddf971e682e64287cc06bae2a05b08b6"

RPROVIDES:${PN} += "antlr-devel"

RDEPENDS:${PN} += "antlr"

inherit rpm
