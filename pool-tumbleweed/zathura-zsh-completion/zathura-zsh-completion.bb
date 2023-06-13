SUMMARY = "Zathura zsh completion"
DESCRIPTION = "Optional dependency offering zsh completion for zathura"
LICENSE = "Zlib"

PV = "0.5.2"

RPM_NAME = "zathura-zsh-completion-0.5.2-1.3.aarch64.rpm"
RPM_HASH = "84f2ca46db0a65ea6d8607a9d900b1712912a64d5fbf938d1d4e1ef68232f66bcf7d5db66a4cea3316f073a8723a528e9bbe0a38aa3d16c95f26ead8edd02917"

RPROVIDES:${PN} += "zathura-zsh-completion \
zathura-zsh-completion(aarch-64)"

RDEPENDS:${PN} += "zathura \
zsh"

inherit rpm
