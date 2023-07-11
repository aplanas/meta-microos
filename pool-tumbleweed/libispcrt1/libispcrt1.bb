SUMMARY = "C-based SPMD programming language compiler library"
DESCRIPTION = "Libary for a variant of the C programming language, with extensions for \
'single program, multiple data' (SPMD) programming."
LICENSE = "BSD-3-Clause"

PV = "1.18.1"

RPM_NAME = "libispcrt1-1.18.1-2.2.aarch64.rpm"
RPM_HASH = "6cea63337f5f38f2bc710cff1389c5831ac9f2d4fd8252de37dc54769bfa82cbebe4300912247df15018a184775b4ce0d1d17c7c73747212e7bf340343268bad"

RPROVIDES:${PN} += "libispcrt.so.1 \
libispcrt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libomp.so \
libstdc++.so.6"

inherit rpm
