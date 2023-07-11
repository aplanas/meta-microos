SUMMARY = "Verilog language utilities and parsing"
DESCRIPTION = "Verilog language utilities and parsing"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.480"

RPM_NAME = "perl-Verilog-Perl-3.480-1.4.aarch64.rpm"
RPM_HASH = "59c5a536f79348805130d9a35158ddfad6fe6a79bbaef22af622256837ab634ae00469ee98ffaaba87480e18265e78375cbcf4e95877b68006382ad3a9bca287"

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
perl--MODULE-COMPAT-5.36.1 \
perl-Pod--Usage"

inherit rpm
