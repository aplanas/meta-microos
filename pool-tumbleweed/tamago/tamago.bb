SUMMARY = "Multilingual input method for Emacs"
DESCRIPTION = "Tamago offers a multilingual input environment for GNU Emacs (>= 23.x). \
It is completely written in Emacs Lisp and can use the backends FreeWnn \
(jserver, cserver, tserver), Wnn6, SJ3 Ver.2, and Canna."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.7.1"

RPM_NAME = "tamago-5.0.7.1-3.2.noarch.rpm"
RPM_HASH = "78f54db3c9419202d8150c6e5cdd9114dc0fc44d946d975f2ea285deb1b95b3e2cdf434bd28752c73ae8c558c4fa3df37faf22269f751682fb6b1b432e27c603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tamago"

RDEPENDS:${PN} += "emacs"

inherit rpm
