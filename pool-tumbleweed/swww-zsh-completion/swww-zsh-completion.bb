SUMMARY = "Zsh Completion for swww"
DESCRIPTION = "Zsh command-line completion support for swww."
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "swww-zsh-completion-0.8.1-2.1.noarch.rpm"
RPM_HASH = "92f15ec9efb5e51f625f0bd753939d1a5f585b0198dedcd1a4ecce72859d037ed4060b3db4a7adb935a14120c1b31de116047ea2087cddd7f0780a5687cc0aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swww-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
