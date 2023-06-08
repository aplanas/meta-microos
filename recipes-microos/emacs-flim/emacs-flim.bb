SUMMARY = "An Emacs Library for MIME"
DESCRIPTION = "For coding and decoding MIME messages."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.9+130+g289e5bbd66f6"

RPM_NAME = "emacs-flim-1.14.9+130+g289e5bbd66f6-1.4.noarch.rpm"
RPM_HASH = "cd0044362d5dc8ce1780de62d189354bf2fa281c251ec1d48900c0e135621433f289ef49c0f91d044e0eae21166128add621210858e04a57c71e0423a5859df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-flim flim"
RDEPENDS:${PN} += "emacs emacs-apel emacs_program"

inherit rpm
