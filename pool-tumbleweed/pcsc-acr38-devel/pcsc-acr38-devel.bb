SUMMARY = "PC/SC IFD Handler for the ACR38 Smart Card Reader"
DESCRIPTION = "This package contains a driver for the ACR 38 smart card reader \
produced by ACS. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "GPL-2.0+"

PV = "1.7.11"

RPM_NAME = "pcsc-acr38-devel-1.7.11-7.26.aarch64.rpm"
RPM_HASH = "de12ae4cb80bf03676d32579dede7dea1ffcd5f9552452b65ba0d15f3d90941b93b751f776e771b2ffdbb3189a5091374d80a9cebc60ce899319033fc276ef41"

RPROVIDES:${PN} += "pcsc-acr38-devel \
pkgconfig-libacr38ucontrol"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libacr38ucontrol0 \
pcsc-lite-devel"

inherit rpm
