SUMMARY = "Configuration file for keylime"
DESCRIPTION = "Subpackage of keylime for the shared configuration files for the agent \
and the server components."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.4.0"

RPM_NAME = "keylime-config-7.4.0-1.1.noarch.rpm"
RPM_HASH = "a4f3ea0b529dbd2e6a64d835d557eca1ee2c6fab45d211130aeb3c9b700f4b1ec738013a4faa6c203047b558bf002f44c5e6dd451174450cb1e4c36da4128ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-config"

RDEPENDS:${PN} += "python3-keylime"

inherit rpm
