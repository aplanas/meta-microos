SUMMARY = "XDG provides an interface for using XDG directory standard"
DESCRIPTION = "XDG provides an interface for using XDG directory standard."
LICENSE = "BSD-2-Clause"

PV = "2.2.5"

RPM_NAME = "ruby3.2-rubygem-xdg-2-2.2.5-1.17.aarch64.rpm"
RPM_HASH = "ebe438887dad46913aa82f0022d39894a742cb404ec28d02f41fdbbd2529448f25c5619ebbd7eabef1572dd13789569b4102b9486268674dfeb4a650a94abb54"

RPROVIDES:${PN} += "ruby3.2-rubygem-xdg-2 \
rubygem-ruby-3.2.0-xdg \
rubygem-ruby-3.2.0-xdg-2 \
rubygem-ruby-3.2.0-xdg-2.2 \
rubygem-ruby-3.2.0-xdg-2.2.5 \
rubygem-xdg"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
