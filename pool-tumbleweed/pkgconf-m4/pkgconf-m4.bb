SUMMARY = "m4 macros for pkgconf"
DESCRIPTION = "This package includes m4 macros used to support PKG_CHECK_MODULES \
when using pkgconf with autotools."
LICENSE = "GPL-2.0-or-later-WITH-Autoconf-exception-2.0"

PV = "1.8.0"

RPM_NAME = "pkgconf-m4-1.8.0-2.3.noarch.rpm"
RPM_HASH = "0bb7e2bfaec4ffcce04cb2407225a9fa25b3ccd860835d36e79a72b6af68c9832a32fe7eef7c2569c1e91c165d13cc1b564b1c8c541606f6ac7df3adcc0109f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconf-m4"

RDEPENDS:${PN} += ""

inherit rpm
