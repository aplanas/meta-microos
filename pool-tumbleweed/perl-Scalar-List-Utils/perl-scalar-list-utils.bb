SUMMARY = "Common Scalar and List utility subroutines"
DESCRIPTION = "Common Scalar and List utility subroutines"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.63"

RPM_NAME = "perl-Scalar-List-Utils-1.63-1.5.aarch64.rpm"
RPM_HASH = "7a94db84ef7a2b686646be7c0c54684dac2bbc7074b803b7deadbd1660d97334b3932fcfe5914ded73a54c4b63d75988ade6375954a5cce3024f0c391093cd0a"

RPROVIDES:${PN} += "perl-List--Util \
perl-List--Util--XS \
perl-Scalar--Util \
perl-Scalar-List-Utils \
perl-Sub--Util"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
