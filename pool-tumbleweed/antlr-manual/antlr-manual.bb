SUMMARY = "ANother Tool for Language Recognition (Manual)"
DESCRIPTION = "ANTLR, Another Tool for Language Recognition, (formerly PCCTS) is a \
language tool that provides a framework for constructing recognizers, \
compilers, and translators from grammatical descriptions containing C++ \
or Java actions (you can use PCCTS 1.xx to generate C-based parsers). \
 \
This package provides the manual for antlr."
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain & MIT"

PV = "2.7.7"

RPM_NAME = "antlr-manual-2.7.7-122.1.noarch.rpm"
RPM_HASH = "9289f1e400e3c893f4403b368abbd6f76970846a21c42f020f90a8c217adff45267cb18297f9d3768b8816622f9dc1552cb08fe00edcfe8f65fb6b89ea1bf6a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr-manual"

RDEPENDS:${PN} += ""

inherit rpm
