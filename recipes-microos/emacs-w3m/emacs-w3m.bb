SUMMARY = "An interface program to use w3m with Emacs"
DESCRIPTION = "Emacs-w3m is an interface program to use w3m with Emacs. \
 \
W3 is the most well known WEB browser which works on (X)Emacs, but it \
is very slow. Emacs-w3m is an alternative. It uses w3m, which is a pager \
with WWW capability, developed by Akinori ITO. It is a pager, but it \
can be used as a text-mode WWW browser."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.632+546+gf8819bca"

RPM_NAME = "emacs-w3m-1.4.632+546+gf8819bca-1.1.noarch.rpm"
RPM_HASH = "b492eeedc1e0dc94a39f1968708f416c1738470b096a212b4782c03a6c664e930c070eccb2968f1cf1b66cee7fc9ad374da9162836642fdafabf3e369134a65f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(emacs-w3m) emacs-w3m w3m-el"
RDEPENDS:${PN} += "/bin/sh apel emacs flim w3m"

inherit rpm
