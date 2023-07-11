SUMMARY = "Database connectivity for Mono"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Database connectivity for Mono."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "mono-data-sqlite-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "15f952b74442ca7dad036a1ce88725f6b15697957c0d3f20699280d716b89c54ad21437df75f063b53499348e30f7b9652822f4c37e27f5ad4f8f6f907f8fb2b"

RPROVIDES:${PN} += "mono-Mono.Data.Sqlite \
mono-data-sqlite"

RDEPENDS:${PN} += "mono-System \
mono-System.Data \
mono-System.Transactions \
mono-core \
mono-data \
mono-mscorlib"

inherit rpm
