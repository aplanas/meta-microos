SUMMARY = "Examples for GTKWave"
DESCRIPTION = "GTKWave is a waveform viewer that can view VCD files produced by most Verilog \
simulation tools, as well as LXT files produced by certain Verilog simulation \
tools. \
 \
This package contains examples for GTKWave"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.114"

RPM_NAME = "gtkwave-examples-3.3.114-1.4.noarch.rpm"
RPM_HASH = "2eb4837d205c18ec7655a5ae85a20d0c243bfe139f45953ae4f5bb463ae80b59f9f6701225ae789b7a79d707032ea9fd470c63da51fd8a51ca3ccfac78cad190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkwave-examples"

RDEPENDS:${PN} += "gtkwave"

inherit rpm
