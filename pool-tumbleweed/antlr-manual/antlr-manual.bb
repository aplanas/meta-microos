SUMMARY = "ANother Tool for Language Recognition (Manual)"
DESCRIPTION = "ANTLR, Another Tool for Language Recognition, (formerly PCCTS) is a \
language tool that provides a framework for constructing recognizers, \
compilers, and translators from grammatical descriptions containing C++ \
or Java actions (you can use PCCTS 1.xx to generate C-based parsers). \
 \
This package provides the manual for antlr."
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain & MIT"

PV = "2.7.7"

RPM_NAME = "antlr-manual-2.7.7-122.2.noarch.rpm"
RPM_HASH = "f9069814b5ff34bce1c69a96eeee32e7a635c04eb3e7edad1b38d1980c01dffc3502a21589f236271747b4b6de6f46bb7e1bdf58ac4b1920b3a433ba0ec8058a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr-manual"

RDEPENDS:${PN} += ""

inherit rpm
