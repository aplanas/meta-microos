SUMMARY = "Vim syntax highlighting for icinga2"
DESCRIPTION = "Provides Vim syntax highlighting for icinga2."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "vim-icinga2-2.13.7-1.5.aarch64.rpm"
RPM_HASH = "cc5a3c2fbced9a0e9ef42ef2d7c4917893fbab7ed8b38450c2e5a9ac28c347a68053c2739611fc67f20d1d4220241435ba76c120fb1b0b7d70be27b94240dd5a"

RPROVIDES:${PN} += "vim-icinga2"

RDEPENDS:${PN} += "vim"

inherit rpm
