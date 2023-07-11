SUMMARY = "Zsh tab-completion for gpaste"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
This package provides zsh tab-completion for gpaste."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "gpaste-zsh-completion-43.2+6-2.2.noarch.rpm"
RPM_HASH = "272e9b93c41c28402c28f32ce92724f031b6f16b0431e4658971e47f1ca579b2b0b63722b8e6597ccf562ab9f991e7a937153fab2a4bfaa7303eab011ad56d15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpaste-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
