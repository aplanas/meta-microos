SUMMARY = "Verilog language utilities and parsing"
DESCRIPTION = "Verilog language utilities and parsing"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.480"

RPM_NAME = "perl-Verilog-Perl-3.480-1.5.aarch64.rpm"
RPM_HASH = "4cca9a0ac98bb49869e65cb127249a0bf246bdc395eed6f4647b88977f9ac9efe5d9b4677efe05fb4d440867d5b8d853b03ab2dbd79120003b427c480873ca21"

RPROVIDES:${PN} += "perl-Verilog--EditFiles \
perl-Verilog--Getopt \
perl-Verilog--Language \
perl-Verilog--Netlist \
perl-Verilog--Netlist--Cell \
perl-Verilog--Netlist--ContAssign \
perl-Verilog--Netlist--Defparam \
perl-Verilog--Netlist--File \
perl-Verilog--Netlist--File--Parser \
perl-Verilog--Netlist--Interface \
perl-Verilog--Netlist--Logger \
perl-Verilog--Netlist--ModPort \
perl-Verilog--Netlist--Module \
perl-Verilog--Netlist--Net \
perl-Verilog--Netlist--Pin \
perl-Verilog--Netlist--PinSelection \
perl-Verilog--Netlist--Port \
perl-Verilog--Netlist--Subclass \
perl-Verilog--Parser \
perl-Verilog--Preproc \
perl-Verilog--SigParser \
perl-Verilog--Std \
perl-Verilog-Perl \
perl-std"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Pod--Usage"

inherit rpm
