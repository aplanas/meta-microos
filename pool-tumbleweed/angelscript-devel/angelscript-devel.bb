SUMMARY = "Development files for AngelScript"
DESCRIPTION = "The AngelCode Scripting Library, or AngelScript as it is also known, \
is a scripting library designed to allow applications to extend their \
functionality through external scripts. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of the AngelScript library."
LICENSE = "Zlib"

PV = "2.35.1"

RPM_NAME = "angelscript-devel-2.35.1-1.8.aarch64.rpm"
RPM_HASH = "c2ce4c7f113d4512675dacf402ee28771faa11ed37a137119a23ad65bbb364df1ab9e02ae3cc4c7d1e1b06cb6466e0b849366dd199e62a9114c1eae6c36179e9"

RPROVIDES:${PN} += "angelscript-devel \
pkgconfig-angelscript \
pkgconfig-angelscript-addons"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libangelscript-addons2-35-1 \
libangelscript2-35-1 \
pkgconfig-angelscript"

inherit rpm
