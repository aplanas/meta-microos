SUMMARY = "GeoIP update client code"
DESCRIPTION = "The GeoIP Update program performs automatic updates of GeoIP2 and GeoIP Legacy \
binary databases. Currently the program only supports Linux and other \
Unix-like systems."
LICENSE = "Apache-2.0 | MIT"

PV = "5.0.3"

RPM_NAME = "geoipupdate-5.0.3-1.1.aarch64.rpm"
RPM_HASH = "e2a9711562d99b44b92310f3977ff2a40aab9bc643a73378085a5a756fd2b585717e9bcf0dcf6d68016426a64aeb504446fb02a001a8638516dc1e1aa0535b33"

RPROVIDES:${PN} += "config(geoipupdate) geoipupdate geoipupdate(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
