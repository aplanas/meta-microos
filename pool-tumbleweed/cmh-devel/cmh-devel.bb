SUMMARY = "Development files for the cmh library"
DESCRIPTION = "This software package computes Igusa (genus 2) class polynomials, \
which parameterise the CM points in the moduli space of 2-dimensional \
abelian varieties, i.e. Jacobians of hyperelliptic curves. \
 \
This subpackage provides the development headers for libcmh."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "cmh-devel-1.1.1-1.5.aarch64.rpm"
RPM_HASH = "01ba17941fbc8872b92effe6a1f29644e8735ac8773d927f3ec01620d5bf377343284a9b5e64ba59b1e01a9ae7e8a7378831cde019852c84125b3f840e215619"

RPROVIDES:${PN} += "cmh-devel"

RDEPENDS:${PN} += "libcmh0 \
mpc-devel"

inherit rpm
