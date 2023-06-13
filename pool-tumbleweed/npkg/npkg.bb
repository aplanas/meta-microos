SUMMARY = "The ultimate Node.js packaging toolkit for openSUSE"
DESCRIPTION = "This package provides the ultimate Node.js packaging toolkit \
for openSUSE."
LICENSE = "MIT"

PV = "10.beta11"

RPM_NAME = "npkg-10.beta11-4.2.noarch.rpm"
RPM_HASH = "ff0d6552c5aa40474de4d8fad431935275721a8343fd81b0e2cba3b88be7bf1e2497034a8a7086fa34094da6bb90fec687cbdc4ae9339fe5be89704732278987"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "npkg"

RDEPENDS:${PN} += "/usr/bin/env \
nodejs-packaging \
ruby \
rubygem(json) \
rubygem(nokogiri)"

inherit rpm
