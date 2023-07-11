SUMMARY = "Documentation for GTKWave"
DESCRIPTION = "GTKWave is a waveform viewer that can view VCD files produced by most Verilog \
simulation tools, as well as LXT files produced by certain Verilog simulation \
tools. \
 \
This package contains documentation for GTKWave"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.114"

RPM_NAME = "gtkwave-doc-3.3.114-1.4.noarch.rpm"
RPM_HASH = "3a2224c34f486c1b04d2012e291790cf419f58dcdaebdfb16b977b1a139e492cc3fb11014a7375d0a22fb41f3a6bd64d27686a872e963e3cc32c72fb7252f930"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkwave-doc"

RDEPENDS:${PN} += "gtkwave"

inherit rpm
