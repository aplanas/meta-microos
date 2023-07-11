SUMMARY = "Latex input method for IBus framework"
DESCRIPTION = "ibus-table-latex provides Latex input method on IBus Table under IBus framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-latex-1.3.16-1.1.noarch.rpm"
RPM_HASH = "b6de075076b7ed914be3f081361b27578577882a510dc65a41c704f1f0d4153b476bc2ae495aa23861dccd78a31fc0810e47bc06c2add7ad2e3c8dc3e1b50bdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-latex"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
