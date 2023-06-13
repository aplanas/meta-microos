SUMMARY = "Bash completion for watson"
DESCRIPTION = "Bash command line completion support for watson."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "watson-bash-completion-2.1.0-1.4.noarch.rpm"
RPM_HASH = "0795fc9525c6862319fe285e0ee430e6bc9a036e05f2144fc8633af2c40d01a3c9631792f7671c99b17f62d167921e6502c8d850c0f51de233adc6bd6f244b1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "watson-bash-completion"

RDEPENDS:${PN} += "watson"

inherit rpm
