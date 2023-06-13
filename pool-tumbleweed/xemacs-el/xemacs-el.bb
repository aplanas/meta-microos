SUMMARY = "Emacs-Lisp source files for XEmacs"
DESCRIPTION = "Most Emacs-Lisp source files are not needed for running XEmacs. Most of \
them are also available in byte compiled form and therefore not \
necessary at runtime. The true XEmacs addict will install them \
nevertheless because it is often useful and enlightening to have a look \
at the Lisp sources."
LICENSE = "GPL-3.0-or-later"

PV = "21.5.34"

RPM_NAME = "xemacs-el-21.5.34-22.3.noarch.rpm"
RPM_HASH = "4e5533f34222611a247639f27c83f4c7fd9881b4bf21bcad70b999031296ba12367aa38742c15b78a57d7e01e14eb3fe244d9ed5d4f4ca7b59fef5e8bee80768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xemacs-el"

RDEPENDS:${PN} += "xemacs \
xemacs-packages-el"

inherit rpm
