SUMMARY = "A Powerline like prompt for Bash, ZSH and Fish"
DESCRIPTION = "A Powerline like prompt for Bash, ZSH and Fish. Based on Powerline-Shell by @banga. Ported to golang by @justjanne."
LICENSE = "GPL-3.0-or-later"

PV = "1.22.1"

RPM_NAME = "powerline-go-1.22.1-1.2.aarch64.rpm"
RPM_HASH = "8f82a6d48fe5ea70c4ea534137b55e92fb0e79abfc8531a59b9328acb99e4e5a06113ad0594fa89a5119e8b590c3881e2c10e64d926bdc7c228bad519be4079b"

RPROVIDES:${PN} += "powerline-go \
powerline-go(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
