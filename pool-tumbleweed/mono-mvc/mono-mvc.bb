SUMMARY = "Mono implementation of ASP"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Mono implementation of ASP.NET MVC."
LICENSE = "MIT & MS-PL"

PV = "6.12.0"

RPM_NAME = "mono-mvc-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "954b8a3237c8e606c9789b51b1aa103e9b827bfb9bfd4a090c4b31508d86957e0f4428d912851b6b21927c0ace130af7d7cdc2241ef64ed08dc05cb609cf6698"

RPROVIDES:${PN} += "mono-System.Web.DynamicData \
mono-System.Web.Extensions \
mono-System.Web.Extensions.Design \
mono-System.Web.Mvc \
mono-mvc \
pkgconfig-system.web.extensions-1.0 \
pkgconfig-system.web.extensions.design-1.0 \
pkgconfig-system.web.mvc \
pkgconfig-system.web.mvc2 \
pkgconfig-system.web.mvc3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mono-Microsoft.Web.Infrastructure \
mono-System \
mono-System.ComponentModel.DataAnnotations \
mono-System.Configuration \
mono-System.Core \
mono-System.Data.Linq \
mono-System.Design \
mono-System.Drawing \
mono-System.Runtime.Caching \
mono-System.ServiceModel \
mono-System.Web \
mono-System.Web.ApplicationServices \
mono-System.Web.Razor \
mono-System.Web.Services \
mono-System.Web.WebPages \
mono-System.Web.WebPages.Razor \
mono-System.Xml \
mono-core \
mono-mscorlib"

inherit rpm
