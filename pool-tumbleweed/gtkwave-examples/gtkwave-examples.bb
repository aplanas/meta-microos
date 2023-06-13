SUMMARY = "Examples for GTKWave"
DESCRIPTION = "GTKWave is a waveform viewer that can view VCD files produced by most Verilog \
simulation tools, as well as LXT files produced by certain Verilog simulation \
tools. \
 \
This package contains examples for GTKWave"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.114"

RPM_NAME = "gtkwave-examples-3.3.114-1.3.noarch.rpm"
RPM_HASH = "dc0b8bf44fd567b03ff8ecef47ad56e310d1d7f9eff39e6c478554049caef119b532bd97c7ebc47d77dd7e7e9919063242980441520666488618a8c56dc3e93e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkwave-examples"

RDEPENDS:${PN} += "gtkwave"

inherit rpm
