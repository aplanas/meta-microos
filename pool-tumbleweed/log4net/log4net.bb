SUMMARY = "A .NET framework for logging"
DESCRIPTION = "log4net is a tool to help the programmer output log statements to a \
variety of output targets. log4net is a port of the excellent log4j \
framework to the .NET runtime"
LICENSE = "Apache-2.0"

PV = "1.2.10"

RPM_NAME = "log4net-1.2.10-78.2.noarch.rpm"
RPM_HASH = "d0c5b81c3864005fd1de46a3f13638ab122e15893c4ff736de06df5f2aa3b3885785f59ac1face6a5377ef5337e50216acfdf9949197b08ad61a831633feb421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4net \
mono(log4net) \
pkgconfig(log4net)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
mono(System) \
mono(System.Data) \
mono(System.Web) \
mono(System.Xml) \
mono(mscorlib)"

inherit rpm
