SUMMARY = "Database connectivity for DB2"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Database connectivity for DB2."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "ibm-data-db2-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "72d3c1940a770bb6fbbf1dbb3a087fe7307b36b6e7fac649d1c6b7367e3838f8fd9a1aa92e5f8a82b4fb6ebad48554e7abc2be2b228197c6e7d7a60a9e9f0f39"

RPROVIDES:${PN} += "ibm-data-db2 \
mono-IBM.Data.DB2"

RDEPENDS:${PN} += "mono-System \
mono-System.Data \
mono-core \
mono-mscorlib"

inherit rpm
