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

RPM_NAME = "libmono-2_0-devel-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "d83e59858a4830a4751ef0a7bf7d5adf7d08e8804f7930e11312659105239c9a08719162a2ada80e5b7bc5bdcca250cc8a4ddbe85892464fca397c7c191ac437"

RPROVIDES:${PN} += "libmono-2-0-devel \
pkgconfig-mono-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmono-2-0-1 \
libmonosgen-2-0-devel \
mono-core"

inherit rpm
