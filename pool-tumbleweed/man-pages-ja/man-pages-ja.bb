SUMMARY = "LDP Manual Pages (Japanese)"
DESCRIPTION = "These are the Japanese man pages of the Linux Documentation Project. \
Note that they are normally older than the English versions.  For \
reference, you should use the English versions."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GFDL-1.1-only & GFDL-1.2-only & GFDL-1.3-only"

PV = "20230615"

RPM_NAME = "man-pages-ja-20230615-1.1.noarch.rpm"
RPM_HASH = "47e187a2666a96da435bf4e3e9005f96571978cd15e1a009b5f1a219fb6d6fe931e50d8f47dfc2856a4b008818683cfd72ae7912e1bb1111b86f70b02cf8418b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-ja \
man-pages-ja"

RDEPENDS:${PN} += ""

inherit rpm
