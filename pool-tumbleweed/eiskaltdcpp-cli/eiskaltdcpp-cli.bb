SUMMARY = "CLI frontend for eiskaltdcpp"
DESCRIPTION = "This package contains the EiskaltDC++ CLI (command-line interface) written in Perl. \
This program is used to control the EiskaltDC++ daemon via the JSON-RPC protocol. \
EiskaltDC++ is a program that uses the Direct Connect and Advanced \
Direct Connect protocols. It is compatible with DC++, AirDC++, \
FlylinkDC++ and other DC clients. EiskaltDC++ also interoperates with \
all common DC hub software."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-cli-2.4.2-1.14.aarch64.rpm"
RPM_HASH = "31ea07d3cb2cdbd023be3091e2b93d92736559f5a31342f03ef9368656735316ec76cee397bc3a602bd346a078fcd1b79504be032d1d76bb4eaa2ae047e3f986"

RPROVIDES:${PN} += "eiskaltdcpp-cli"

RDEPENDS:${PN} += "/usr/bin/perl \
eiskaltdcpp-common \
perl-JSON--RPC"

inherit rpm
