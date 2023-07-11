SUMMARY = "Igusa (genus 2) class polynomial computation library"
DESCRIPTION = "This library package computes Igusa (genus 2) class polynomials, \
which parameterise the CM points in the moduli space of 2-dimensional \
abelian varieties, i.e. Jacobians of hyperelliptic curves. \
 \
It includes libraries that can be called from within a C program. \
This subpackage provides the development headers for CM."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "libcmh0-1.1.1-1.5.aarch64.rpm"
RPM_HASH = "7ea7956179e66ca1aa4d3302f3d0e76bf6d166c5b840cd28fae6606f8c9b116a9dbb47b8e502e89396a40437e2801152a0f26a384522292e542763f47539d9b0"

RPROVIDES:${PN} += "libcmh.so.0 \
libcmh0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpc.so.3 \
libmpfr.so.6"

inherit rpm
