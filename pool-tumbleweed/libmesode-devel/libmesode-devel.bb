SUMMARY = "Development files for libmesode, an XMPP library"
DESCRIPTION = "Mesode is a collection of libraries for speaking the XMPP protocol. \
 \
This package contains the development files and headers for libmesode."
LICENSE = "GPL-3.0-or-later | MIT"

PV = "0.10.1"

RPM_NAME = "libmesode-devel-0.10.1-1.11.aarch64.rpm"
RPM_HASH = "5b7cefd283b9c28cbb450f48fb03add2db0b3bc4794af171ce438df976c2473826a171fff70b20423123f7030bcfd84c2f1797cf6f5d9fb100b6115d97f0ea40"

RPROVIDES:${PN} += "libmesode-devel \
pkgconfig-libmesode"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmesode0 \
pkgconfig-expat \
pkgconfig-openssl"

inherit rpm
