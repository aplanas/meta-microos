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

RPM_NAME = "antlr-devel-2.7.7-122.1.aarch64.rpm"
RPM_HASH = "b306710c334d7d622bbd8f45ca4e8afc1fa108355251a6fa857c643090134468b2db0c03b7df355277046697ed2ca1bae0c782159d317a661cea1f828b63f5a1"

RPROVIDES:${PN} += "antlr-devel antlr-devel(aarch-64)"
RDEPENDS:${PN} += "antlr"

inherit rpm
