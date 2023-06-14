SUMMARY = "Zone record parsing functions for Knot DNS"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains a library for a zone record scanner."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "libzscanner4-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "24867a9b10b6abfb7d5c228c424d0aa7ab82cb8eb962ad2d814d95667f7d56b850d3c186e7b4545cb976ac0d37492392dd60244d55744823a49c3865b566f364"

RPROVIDES:${PN} += "libzscanner.so.4 \
libzscanner4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
