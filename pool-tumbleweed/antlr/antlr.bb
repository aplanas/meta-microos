SUMMARY = "Another Tool for Language Recognition"
DESCRIPTION = "ANTLR, Another Tool for Language Recognition, (formerly PCCTS) is a \
language tool that provides a framework for constructing recognizers, \
compilers, and translators from grammatical descriptions containing C++ \
or Java actions (you can use PCCTS 1.xx to generate C-based parsers)."
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain & MIT"

PV = "2.7.7"

RPM_NAME = "antlr-2.7.7-122.1.aarch64.rpm"
RPM_HASH = "fa981d97848edfa08ea9a0487ffff88f6619a19545f352200f21835fb6b049fa7dc2a9b9455963743da5e6725b107dc399a3aac89681ffd826766b46166f16ec"

RPROVIDES:${PN} += "antlr \
antlr(aarch-64) \
antlr-bootstrap"

RDEPENDS:${PN} += "/bin/sh \
antlr-java"

inherit rpm
