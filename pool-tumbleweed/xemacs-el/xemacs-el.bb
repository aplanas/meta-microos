SUMMARY = "Emacs-Lisp source files for XEmacs"
DESCRIPTION = "Most Emacs-Lisp source files are not needed for running XEmacs. Most of \
them are also available in byte compiled form and therefore not \
necessary at runtime. The true XEmacs addict will install them \
nevertheless because it is often useful and enlightening to have a look \
at the Lisp sources."
LICENSE = "GPL-3.0-or-later"

PV = "21.5.34"

RPM_NAME = "xemacs-el-21.5.34-22.5.noarch.rpm"
RPM_HASH = "851f0030fc3130060fd6fb414992b323e822e5333750bee468555cbd8c931f89c820139f488af7ea7429d20ee4556d76fe590709e7fb020952d9c653e50aed52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xemacs-el"

RDEPENDS:${PN} += "xemacs \
xemacs-packages-el"

inherit rpm
