SUMMARY = "Emacs-Lisp source files for the XEmacs packages"
DESCRIPTION = "Most Emacs-Lisp source files are not needed for running XEmacs. Most of \
them are also available in byte compiled form and therefore not \
necessary at runtime. The true XEmacs addict will install them \
nevertheless because it is often useful and enlightening to have a look \
at the Lisp sources. \
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

RPM_NAME = "xemacs-packages-el-20130822-12.8.noarch.rpm"
RPM_HASH = "29b1bccb6bd08f1330691a259c8d25f1a957ab5dfe9c60e03851e8f4fa391609b819038095c4beabddbb33211cce0f4bd138ee2c73fb603506c77558eae83677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xemacs-el-/usr/share/xemacs/xemacs-packages/etc/auctex/style/amsart.el \
xemacs-packages-el"

RDEPENDS:${PN} += ""

inherit rpm
