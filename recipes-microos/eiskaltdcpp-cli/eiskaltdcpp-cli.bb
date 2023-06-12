SUMMARY = "CLI frontend for eiskaltdcpp"
DESCRIPTION = "This package contains the EiskaltDC++ CLI (command-line interface) written in Perl. \
This program is used to control the EiskaltDC++ daemon via the JSON-RPC protocol. \
EiskaltDC++ is a program that uses the Direct Connect and Advanced \
Direct Connect protocols. It is compatible with DC++, AirDC++, \
FlylinkDC++ and other DC clients. EiskaltDC++ also interoperates with \
all common DC hub software."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-cli-2.4.2-1.13.aarch64.rpm"
RPM_HASH = "9d4f92ddd21894b90466191e8b3a1e684e872b9399242cfedfb6ad41567d3914efe65da24b5b59928f3139affa47d2c9d26d0e6992b484c8e2a2ed588461a65b"

RPROVIDES:${PN} += "eiskaltdcpp-cli \
eiskaltdcpp-cli(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
eiskaltdcpp-common \
perl(JSON::RPC)"

inherit rpm
