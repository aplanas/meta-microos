SUMMARY = "Library and header file for the interface of a2ps"
DESCRIPTION = "a2ps converts ASCII text into PostScript. This feature is used by \
apsfilter, for example, to pretty-print ASCII text. \
 \
Warning: a2ps is not able to convert complex Unicode (UTF-8) text to \
PostScript.  Only language text which can be converted from UTF-8 to \
Latin encodings are supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.15"

RPM_NAME = "a2ps-devel-4.15-1.4.aarch64.rpm"
RPM_HASH = "4d7d432ba63820749ad92c45c613668deae089d552fe0eb4b2aca0c87b5b70acff68a7550f25d582eb3be8150b2aebfa8b87786b74ece9c6a2f8e457bb2d14f8"

RPROVIDES:${PN} += "a2ps-devel"

RDEPENDS:${PN} += "glibc-devel \
liba2ps1"

inherit rpm
