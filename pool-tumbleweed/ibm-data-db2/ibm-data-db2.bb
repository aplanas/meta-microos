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

RPM_NAME = "ibm-data-db2-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "2a06032f9b3304e7a1567a3cc28db9a65dc481dac0859b56e45db6d1687ffd09a13151cd98567bce10a2a06cc1351f7415823455af867cf50a0e961519f2c7b8"

RPROVIDES:${PN} += "ibm-data-db2 \
mono-IBM.Data.DB2"

RDEPENDS:${PN} += "mono-System \
mono-System.Data \
mono-core \
mono-mscorlib"

inherit rpm
