SUMMARY = "XEmacs Packages"
DESCRIPTION = "A collection of additional lisp packages for XEmacs. You must install \
this package when you want to use the XEmacs package, they are needed \
for most non-trivial XEmacs functions. \
 \
 \
 \
Authors: \
-------- \
    Chuck Thompson   <cthomp@cs.uiuc.edu> \
    Ben Wing <wing@666.com> \
    and many other contributors"
LICENSE = "GPL-3.0-or-later"

PV = "20130822"

RPM_NAME = "xemacs-packages-20130822-12.8.noarch.rpm"
RPM_HASH = "6e04720c6a45f94f826f36d284b0f9c2d33144d8b23100b02620926444fd4c9c565519737641a4ce362e49830883ab072acf3ed64e398136b2c1d720afc764db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xemacs-packages \
xemacs-/usr/share/xemacs/xemacs-packages/etc/auctex/style/amsart.elc \
xemacs-packages"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh"

inherit rpm
