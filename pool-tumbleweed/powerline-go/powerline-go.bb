SUMMARY = "A Powerline like prompt for Bash, ZSH and Fish"
DESCRIPTION = "A Powerline like prompt for Bash, ZSH and Fish. Based on Powerline-Shell by @banga. Ported to golang by @justjanne."
LICENSE = "GPL-3.0-or-later"

PV = "1.24"

RPM_NAME = "powerline-go-1.24-1.1.aarch64.rpm"
RPM_HASH = "95749526e4f78e41f6db4a479b7160af27274ac1e75070634488016ccc222fb88b83a9f465a3780a818a3cfb49025e3e379db7292960146416bfa75765a6fc77"

RPROVIDES:${PN} += "powerline-go"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
