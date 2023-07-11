SUMMARY = "A Powerline like prompt for Bash, ZSH and Fish"
DESCRIPTION = "A Powerline like prompt for Bash, ZSH and Fish. Based on Powerline-Shell by @banga. Ported to golang by @justjanne."
LICENSE = "GPL-3.0-or-later"

PV = "1.22.1"

RPM_NAME = "powerline-go-1.22.1-1.3.aarch64.rpm"
RPM_HASH = "83dcf26ef34403f706d1e90ffb642c3ed94c8c840ccf80da0c5f82f45cde50431d46d224e8e891689b3d157cff84feb8de617fd8126a0a4b662bbbddc9a8bbe4"

RPROVIDES:${PN} += "powerline-go"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
