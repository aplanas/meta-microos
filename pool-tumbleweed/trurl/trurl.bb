SUMMARY = "Command line tool for URL parsing and manipulation"
DESCRIPTION = "A CLI tool that parses and manipulates URLs, designed to help \
shell script authors everywhere."
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "trurl-0.8-1.1.aarch64.rpm"
RPM_HASH = "4718d9d3c8f42ace4fecdccf0ec5a23a13c6783f5bb11fbb4b11d3a9732c6863ebf9eae2b27af8e9111cf4a417990551c4924fb19f2eb4a89dee4ffbb02599d6"

RPROVIDES:${PN} += "trurl"

RDEPENDS:${PN} += "libc.so.6 \
libcurl.so.4"

inherit rpm
