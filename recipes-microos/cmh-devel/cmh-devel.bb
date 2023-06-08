SUMMARY = "Development files for the cmh library"
DESCRIPTION = "This software package computes Igusa (genus 2) class polynomials, \
which parameterise the CM points in the moduli space of 2-dimensional \
abelian varieties, i.e. Jacobians of hyperelliptic curves. \
 \
This subpackage provides the development headers for libcmh."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "cmh-devel-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "01abe2f1c090f59fb08fb1fcb081d8dd92094e357c834445f35e42a470f3ea2b1c81d5b5921d0b41749e989de8a82e9ce98dba7105553fc2f0f0686f7e3048e3"

RPROVIDES:${PN} += "cmh-devel cmh-devel(aarch-64)"
RDEPENDS:${PN} += "libcmh0 mpc-devel"

inherit rpm
