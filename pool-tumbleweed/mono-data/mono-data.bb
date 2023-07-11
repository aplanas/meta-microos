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

RPM_NAME = "mono-data-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "41bf4749db99122a447452ead79a6cf137e102743e7d09693149e31af356501ceae1988279d6594abf7e00f7bd6e8cda1fc28d6e2b8c1ba1c2741096d3e06c83"

RPROVIDES:${PN} += "mono-Mono.Data.Tds \
mono-Novell.Directory.Ldap \
mono-System.Data \
mono-System.Data.DataSetExtensions \
mono-System.Data.Entity \
mono-System.Data.Linq \
mono-System.DirectoryServices \
mono-System.DirectoryServices.Protocols \
mono-System.EnterpriseServices \
mono-System.Runtime.Serialization \
mono-System.Transactions \
mono-WebMatrix.Data \
mono-data \
mono-directory \
mono-ms-enterprise \
mono-novell-directory \
mono-sqlmetal \
mono-sqlsharp"

RDEPENDS:${PN} += "/usr/bin/sh \
mono-Mono.Security \
mono-System \
mono-System.ComponentModel.DataAnnotations \
mono-System.Configuration \
mono-System.Core \
mono-System.Numerics \
mono-System.ServiceModel.Internals \
mono-System.Xml \
mono-System.Xml.Linq \
mono-core \
mono-mscorlib"

inherit rpm
