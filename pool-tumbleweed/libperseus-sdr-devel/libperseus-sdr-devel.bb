SUMMARY = "Development files for libperseus-sdr"
DESCRIPTION = "Libraries and header files for developing applications that want to \
make use of libperseus-sdr."
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "libperseus-sdr-devel-0.8.1-1.23.aarch64.rpm"
RPM_HASH = "854e52d511176de9a2d4b0449c257208d5791a208bb670cd31787e1982d05cdffdb3be75459b4fcaddadcfc6ad12a52462fe3c972271f1f6176166a093cc7dc2"

RPROVIDES:${PN} += "libperseus-sdr-devel"

RDEPENDS:${PN} += "libperseus-sdr0"

inherit rpm
