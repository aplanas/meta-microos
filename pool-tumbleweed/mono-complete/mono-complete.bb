SUMMARY = "Install everything built from the mono source tree"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Install everything built from the mono source tree.  Note that this does \
not install anything from outside the mono source (XSP, mono-basic, etc.)."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "mono-complete-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "dd4bdab727fd6e7bdab4c3af37e531a3751921ec812856c96ca1b9da328973724b41243cdc9766af483e202fc8aa616693f19c2f5716124e14abe3b514f8870d"

RPROVIDES:${PN} += "mono-complete"

RDEPENDS:${PN} += "ibm-data-db2 \
libmono-2-0-1 \
libmono-2-0-devel \
libmonosgen-2-0-1 \
libmonosgen-2-0-devel \
mono-core \
mono-data \
mono-data-oracle \
mono-data-sqlite \
mono-devel \
mono-extras \
mono-locale-extras \
mono-mvc \
mono-reactive \
mono-wcf \
mono-web \
mono-winforms \
mono-winfxcore \
monodoc-core"

inherit rpm
