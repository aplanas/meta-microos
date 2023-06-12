SUMMARY = "Development files for cld2"
DESCRIPTION = "A library that detects over 80 languages in UTF-8 text, based largely \
on groups of four letters. Also tables for 160+ language versions. \
 \
This subpackage contains the headers for cld2."
LICENSE = "Apache-2.0"

PV = "20150820"

RPM_NAME = "cld2-devel-20150820-5.9.aarch64.rpm"
RPM_HASH = "00a63adfb0439c30addc77afa109b102250027e6ab613a248afa5e67055aceefec7202764b0bdd5056c24aba6ba42b390494d20c6c9ca7b67680c8b982d5ff61"

RPROVIDES:${PN} += "cld2-devel \
cld2-devel(aarch-64) \
pkgconfig(cld2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcld2-0"

inherit rpm
