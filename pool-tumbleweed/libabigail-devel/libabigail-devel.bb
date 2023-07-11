SUMMARY = "Development files for the ABI-relevant artifact library"
DESCRIPTION = "ABIGAIL constructs, manipulates, (de-)serializes ABI-relevant \
artifacts, such as types, variable, fonctions and declarations \
(collectively, the ABI corpus) of a given library or program. The \
library provides a way to compare two ABI corpuses, provide detailed \
information about their differences. \
 \
This subpackage contains the files needed to build programs with ABIGAIL."
LICENSE = "LGPL-3.0-or-later"

PV = "2.3"

RPM_NAME = "libabigail-devel-2.3-1.1.aarch64.rpm"
RPM_HASH = "c041421f19e1ee5be70b2b6a4d4595f63afd7ecf311bb87d56f4b99c8b87bd465e66c1f1746b348c7da2c5c260bdbf4071f1702b34645dd9f67f4591343c5927"

RPROVIDES:${PN} += "libabigail-devel \
pkgconfig-libabigail"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libabigail2 \
pkgconfig-libxml-2.0"

inherit rpm
