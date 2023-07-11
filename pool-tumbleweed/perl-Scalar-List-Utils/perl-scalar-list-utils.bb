SUMMARY = "Common Scalar and List utility subroutines"
DESCRIPTION = "Common Scalar and List utility subroutines"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.63"

RPM_NAME = "perl-Scalar-List-Utils-1.63-1.4.aarch64.rpm"
RPM_HASH = "347d8a9c34050ef5fdaffd40945fc4558b9ce84a3d36590ec106716b5039930b65c5ea7c28e70fdc59d9be4448dd725102321f529c2609262e0a8e0c66c7c83c"

RPROVIDES:${PN} += "perl-List--Util \
perl-List--Util--XS \
perl-Scalar--Util \
perl-Scalar-List-Utils \
perl-Sub--Util"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
