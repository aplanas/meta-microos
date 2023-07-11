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

RPM_NAME = "soci-odbc-devel-4.0.2-4.5.aarch64.rpm"
RPM_HASH = "7b68d132c96d667dd74b856c01192de3de59ae71daa2c11b8c622c1941bcc70950f6f9a26de4b50cd9821f3c08ecdcb9263e3813eaa4e9e2098356518cd48dcd"

RPROVIDES:${PN} += "soci-odbc-devel"

RDEPENDS:${PN} += "libsoci-odbc4-0 \
pkgconfig-odbc \
soci-devel"

inherit rpm
