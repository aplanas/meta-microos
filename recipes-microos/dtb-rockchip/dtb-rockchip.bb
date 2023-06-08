SUMMARY = "Rockchip based arm64 systems"
DESCRIPTION = "Device Tree files for Rockchip based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-rockchip-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "e270c42022407902a077cb7583bc75b4588f301d71c8630ee1dac180b1d1029267e557c78e5ac41cc548ead6e4c3a0c120ac6f69264f27a7ac26b1c2958b2579"

RPROVIDES:${PN} += "dtb-rockchip dtb-rockchip(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
