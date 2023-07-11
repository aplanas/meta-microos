SUMMARY = "Development files for AngelScript"
DESCRIPTION = "The AngelCode Scripting Library, or AngelScript as it is also known, \
is a scripting library designed to allow applications to extend their \
functionality through external scripts. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of the AngelScript library."
LICENSE = "Zlib"

PV = "2.35.1"

RPM_NAME = "angelscript-devel-2.35.1-1.9.aarch64.rpm"
RPM_HASH = "987497b2a020653d5a99557d3a88d29cc77a2c1158dfa3f7c271e4cd72def37e8ea34de51871b659d302e105a74312265282b532ec050a73ce1b3b80cbbbd22f"

RPROVIDES:${PN} += "angelscript-devel \
pkgconfig-angelscript \
pkgconfig-angelscript-addons"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libangelscript-addons2-35-1 \
libangelscript2-35-1 \
pkgconfig-angelscript"

inherit rpm
