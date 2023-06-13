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

RPM_NAME = "mono-data-oracle-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "8720ae10f4190b67a650eeff99c6153f98f1dcce4bdf52746384973f0b474f8857d49fcc9d3691f92e7b5cce4b1e4919c0c8945d76c91e8e2dec65d6df290eba"

RPROVIDES:${PN} += "mono(System.Data.OracleClient) \
mono-data-oracle \
mono-data-oracle(aarch-64)"

RDEPENDS:${PN} += "mono(System) \
mono(System.Data) \
mono(System.Drawing) \
mono(System.EnterpriseServices) \
mono(mscorlib) \
mono-core \
mono-data"

inherit rpm
