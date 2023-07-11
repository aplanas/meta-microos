SUMMARY = "Extra locale information"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Extra locale information."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "mono-locale-extras-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "8cdbc6e6c2e458f6fb3c6cb68340956066374d45b4aa3f9bc61461a3adab02252e3364b613718c8fec10d9e3c8c2d813b8f19d8ec6a4a369a7f66aace57cb469"

RPROVIDES:${PN} += "mono-I18N.CJK \
mono-I18N.MidEast \
mono-I18N.Other \
mono-I18N.Rare \
mono-locale-extras"

RDEPENDS:${PN} += "mono-I18N \
mono-core \
mono-mscorlib"

inherit rpm
