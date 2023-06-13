SUMMARY = "Development files for the soci ODBC back-end"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci with unixODBC."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-odbc-devel-4.0.2-4.4.aarch64.rpm"
RPM_HASH = "98cfd565bd77d5f731d48b662f65b47985ff4b29e66e039e5a60d34370d12d9b7aa5dcc44f13db391a66b43701355ac5f79d825550da562276344da9692111de"

RPROVIDES:${PN} += "soci-odbc-devel \
soci-odbc-devel(aarch-64)"

RDEPENDS:${PN} += "libsoci_odbc4_0 \
pkgconfig(odbc) \
soci-devel"

inherit rpm
