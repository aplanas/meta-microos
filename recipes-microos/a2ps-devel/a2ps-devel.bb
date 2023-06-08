SUMMARY = "Library and header file for the interface of a2ps"
DESCRIPTION = "a2ps converts ASCII text into PostScript. This feature is used by \
apsfilter, for example, to pretty-print ASCII text. \
 \
Warning: a2ps is not able to convert complex Unicode (UTF-8) text to \
PostScript.  Only language text which can be converted from UTF-8 to \
Latin encodings are supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.15"

RPM_NAME = "a2ps-devel-4.15-1.3.aarch64.rpm"
RPM_HASH = "543351d7a64e95d4cab542375323d3c560e114a2d5af4db829f936b4db3d72f58a739c82899d669dc9b07399c41547c5915d314323e5305c53464537af64e360"

RPROVIDES:${PN} += "a2ps-devel a2ps-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel liba2ps1"

inherit rpm
