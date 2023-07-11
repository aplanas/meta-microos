SUMMARY = "Development files for libmono"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Development files for libmono."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "libmono-2_0-devel-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "c82d08888af783a597f7a1701a99ba325e8b3cfbcb57a210cfed825156e07d83c0d8ef95420968b47d5aba4c51013b3d812ce191a7ebf2af5dd40de1db0108c3"

RPROVIDES:${PN} += "libmono-2-0-devel \
pkgconfig-mono-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmono-2-0-1 \
libmonosgen-2-0-devel \
mono-core"

inherit rpm
