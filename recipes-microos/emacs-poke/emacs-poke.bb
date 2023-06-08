SUMMARY = "Emacs support for poke"
DESCRIPTION = "Provides Emacs support for poke."
LICENSE = "GPL-3.0-or-later"

PV = "3.1"

RPM_NAME = "emacs-poke-3.1-1.1.noarch.rpm"
RPM_HASH = "f6d626ecc56c81be6fa433ea2ac50ad86532fc4da3e8a871257d6edf86698b132299c1d23c867a77d2e43b30150fa30eb0a9607a3375038097676f89fbdd8c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-poke"
RDEPENDS:${PN} += "emacs poke"

inherit rpm
