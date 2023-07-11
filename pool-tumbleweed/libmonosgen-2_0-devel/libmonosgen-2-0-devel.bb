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

RPM_NAME = "libmonosgen-2_0-devel-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "50eedb3a7081a3138a78112da6ca3657cb6315289987fc76b58f037fe6d2fedf140519bb62ebfd80c3a9f622cf31e69c4d67749d725d5dbeed585f428e38682d"

RPROVIDES:${PN} += "libmonosgen-2-0-devel \
pkgconfig-monosgen-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmono-2-0-devel \
libmonosgen-2-0-1 \
mono-core"

inherit rpm
