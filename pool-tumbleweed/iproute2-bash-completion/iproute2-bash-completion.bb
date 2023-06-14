SUMMARY = "Bash completion for iproute"
DESCRIPTION = "bash command line completion support for iproute."
LICENSE = "GPL-2.0-or-later"

PV = "6.3"

RPM_NAME = "iproute2-bash-completion-6.3-1.1.aarch64.rpm"
RPM_HASH = "afd881c5374c16b0f46e02f818993bea4b729db8a9a57746de2c32c8f8802365b956986e6e33b5efaecb776f49a6ffb9c139cabd40ca111bd76318c7cb09d597"

RPROVIDES:${PN} += "iproute2-bash-completion"

RDEPENDS:${PN} += "bash-completion \
iproute2"

inherit rpm
