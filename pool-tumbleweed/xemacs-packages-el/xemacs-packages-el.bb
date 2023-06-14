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

RPM_NAME = "xemacs-packages-el-20130822-12.6.noarch.rpm"
RPM_HASH = "7b7323dcdeb50c798ac7127a45d9b03589dc59abf995d383a7767b792bef20fa90a704712c1c08beaa1e5d72252bd9bac796a8619d616602a22873134689a0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xemacs-el-/usr/share/xemacs/xemacs-packages/etc/auctex/style/amsart.el \
xemacs-packages-el"

RDEPENDS:${PN} += ""

inherit rpm
