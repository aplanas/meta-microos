SUMMARY = "Bash completion for cpu-x"
DESCRIPTION = "Shell completion definitions from cpu-x for cpu-x."
LICENSE = "GPL-3.0-or-later"

PV = "4.5.3"

RPM_NAME = "cpu-x-bash-completion-4.5.3-1.2.noarch.rpm"
RPM_HASH = "4b5f0e4c6b2fa62b5ee017198bf728413eadc7572790b0a2980457e4eec36b8574e13904c7825f597e5abd53044f2c275e12d782ba0810391413666eec2e1989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpu-x-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
