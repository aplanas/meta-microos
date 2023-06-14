SUMMARY = "Development files for libmonosgen"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Development files for libmonosgen."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "libmonosgen-2_0-devel-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "b0b431c455fca4620b376918c141e2aaa9ab1319b792610114433587312851efa9f42a44d9850b43460dcba0214f04ce0b4c80e6dfaba45865eb4acd4ebb9b8e"

RPROVIDES:${PN} += "libmonosgen-2-0-devel \
pkgconfig-monosgen-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmono-2-0-devel \
libmonosgen-2-0-1 \
mono-core"

inherit rpm
