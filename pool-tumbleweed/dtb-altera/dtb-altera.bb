SUMMARY = "Altera based arm64 systems"
DESCRIPTION = "Device Tree files for Altera based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-altera-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "8024307aab0306e44536c3bcda4cf5ea22fc7ac86e772cf376019749337805bf1e88939bf6190f4114afa2a2ffb09528f5471444b9bbc86aef97ec81998651b6"

RPROVIDES:${PN} += "dtb-altera \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
