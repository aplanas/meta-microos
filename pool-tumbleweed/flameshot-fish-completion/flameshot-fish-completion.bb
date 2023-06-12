SUMMARY = "Fish completion for flameshot"
DESCRIPTION = "Fish command line completion support for flameshot."
LICENSE = "GPL-3.0-only"

PV = "12.1.0"

RPM_NAME = "flameshot-fish-completion-12.1.0-2.1.noarch.rpm"
RPM_HASH = "54133ea8350190cf50cae57e4220301676f217c7803286a810a0b46b6845d31771ade39a3bf91d957b6c1a451687233f4f6f7e9f6b8caaaec16fd235378b8c1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flameshot-fish-completion"
RDEPENDS:${PN} += "flameshot"

inherit rpm
