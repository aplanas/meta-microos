SUMMARY = "A Portable Emacs Library"
DESCRIPTION = "A Portable Emacs Library"
LICENSE = "GPL-2.0-or-later"

PV = "10.8+81+g82eb232"

RPM_NAME = "emacs-apel-10.8+81+g82eb232-1.1.noarch.rpm"
RPM_HASH = "ce289245216f60c5b6dadbb7ceda82697a265e3ba371c626ecf0f72daf1797c813c3cf19d401f9fc1ce37196a51baffb36240453fa31dd2cbbacea326b2c41f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apel \
emacs-apel"

RDEPENDS:${PN} += "emacs \
emacs_program"

inherit rpm
