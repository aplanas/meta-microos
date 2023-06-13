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

RPM_NAME = "libmono-2_0-1-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "8b7d59adf21d7a875a1da28f39473bf1ef3f856e31381ad35bff3331a8a529a799ae9e10df559939b30360775c7a4964b82c50f2fb2f202ee2a06d79359d035f"

RPROVIDES:${PN} += "libmono-2_0-1 \
libmono-2_0-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libmonosgen-2_0-1"

inherit rpm
