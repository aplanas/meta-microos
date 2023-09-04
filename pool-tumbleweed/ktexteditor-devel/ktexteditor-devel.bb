SUMMARY = "Header files for ktexteditor, an embeddable text editor component"
DESCRIPTION = "KTextEditor provides a text editor component that can be embedded in \
applications, either as a KPart or using the KF5::TextEditor library. \
 \
This subpackage provides the header files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "ktexteditor-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "cfa5ef452f27713c11df34166b1689b869b2a578161d7ed4350506a3ced465a4903621feb9a239d3bbef150e7ff58fa535f7a4a51b6f9c2c56ec3e330dc8581a"

RPROVIDES:${PN} += "cmake-KF5TextEditor \
ktexteditor-devel"

RDEPENDS:${PN} += "cmake-KF5Parts \
cmake-KF5SyntaxHighlighting \
extra-cmake-modules \
ktexteditor"

inherit rpm
