SUMMARY = "Mono implementation of core WinFX APIs"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Mono implementation of core WinFX APIs"
LICENSE = "MIT & MS-PL"

PV = "6.12.0"

RPM_NAME = "mono-winfxcore-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "f476e04d75c6073a2a6ea594a660a11dd97a4d96ef5b921131e7f077f09bcbb8ef43b9a745ec47f16c5e4909674760ad6f4bc520e90a5a3756a9523f354fd993"

RPROVIDES:${PN} += "mono-WindowsBase \
mono-winfxcore"

RDEPENDS:${PN} += "mono-System \
mono-System.Xaml \
mono-System.Xml \
mono-core \
mono-mscorlib"

inherit rpm
