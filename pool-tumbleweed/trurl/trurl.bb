SUMMARY = "Command line tool for URL parsing and manipulation"
DESCRIPTION = "A CLI tool that parses and manipulates URLs, designed to help \
shell script authors everywhere."
LICENSE = "MIT"

PV = "0.6"

RPM_NAME = "trurl-0.6-1.1.aarch64.rpm"
RPM_HASH = "26de98f9212c2ee67ef2456a4ba5123dc08907fca097d02d6c73edd57bff14e1ddfe136c8a57c1e228b4cde90cf14597ba6e00031bc20ea03f9b3448651b5f3f"

RPROVIDES:${PN} += "trurl \
trurl(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit)"

inherit rpm
