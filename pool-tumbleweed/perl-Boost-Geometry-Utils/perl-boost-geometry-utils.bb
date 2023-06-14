SUMMARY = "Bindings for the Boost Geometry library"
DESCRIPTION = "Bindings for the Boost Geometry library"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Boost-Geometry-Utils-0.15-4.37.aarch64.rpm"
RPM_HASH = "15dbfd44911aa8c7eee9eaf5ce987786d868cd3e8dd243069d80a1c00e5b327dc33f3af25016e732c2a6373ea63cf9925b928a4d1cec7c45d8a763d488c3f644"

RPROVIDES:${PN} += "perl-Boost--Geometry--Utils \
perl-Boost-Geometry-Utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
