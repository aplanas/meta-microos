SUMMARY = "Emacs support for poke"
DESCRIPTION = "Provides Emacs support for poke."
LICENSE = "GPL-3.0-or-later"

PV = "3.2"

RPM_NAME = "emacs-poke-3.2-1.1.noarch.rpm"
RPM_HASH = "be64c83360c6952a1a89d9e28fe0f656d408fcad30ff4b06bf9d835364b4c1e635a34b289c89357d8d7c19920f4abc51c342416363d0e4ce28a91a7beb7cc3c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-poke"
RDEPENDS:${PN} += "emacs poke"

inherit rpm
