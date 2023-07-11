SUMMARY = "A Library for embedding Mono in your Application"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
A Library for embedding Mono in your Application."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "libmono-2_0-1-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "638da018304fad41f724b0039d8b671c33c3999deaa8f498544d8292b1963a91afb4be64de4df0736dc4d3a1baaabdf82ac7c98fe15f12015ed6a88a00d8ca5c"

RPROVIDES:${PN} += "libmono-2-0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libmonosgen-2-0-1"

inherit rpm
