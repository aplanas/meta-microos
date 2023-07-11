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

RPM_NAME = "mono-data-oracle-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "12cdf239842cbd1130e6523a7e648fb1f034f0acca8d737c820948b9d7a25b093e827a157c4f05c7918091f050e6327bb0c174f104a01fbd6ae862f2363c2f8c"

RPROVIDES:${PN} += "mono-System.Data.OracleClient \
mono-data-oracle"

RDEPENDS:${PN} += "mono-System \
mono-System.Data \
mono-System.Drawing \
mono-System.EnterpriseServices \
mono-core \
mono-data \
mono-mscorlib"

inherit rpm
