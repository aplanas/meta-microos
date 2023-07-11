SUMMARY = "Development files for IML, an Integer Matrix Library"
DESCRIPTION = "IML package provides routines to solve nonsingular systems of linear \
equations, solve any shape systems of linear equations, and perform \
mod p matrix operations, such as computing row-echelon form, \
determinant, rank profile, inverse of a mod p matrix. \
 \
This subpackage contains the include files and library links for \
developing against the IML library."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "iml-devel-1.0.5-5.12.aarch64.rpm"
RPM_HASH = "89a8b0c9e68e9899d62987a083fc9154672b0916f1337c950eb574f19aed33404a39bf4bbedf22a5df04cc1883e8e977dc437941d8e08ab29155b0410eeff175"

RPROVIDES:${PN} += "iml-devel"

RDEPENDS:${PN} += "gmp-devel \
libiml0"

inherit rpm
