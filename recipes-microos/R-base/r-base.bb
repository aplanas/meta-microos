SUMMARY = "R - statistics package (S-Plus like)"
DESCRIPTION = "R is a language which is not entirely unlike the S language developed at \
AT&T Bell Laboratories by Rick Becker, John Chambers and Allan Wilks."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-base-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "5576ef76826343599d1751db4dacd3eb011c68f24830b677eb6577ddd4bdd5251bde7c1e3a04c59542d34c55b60aad5a087772cbc571f6e4b1a7a72db7c63e3e"

RPROVIDES:${PN} += "R R-base R-base(aarch-64)"
RDEPENDS:${PN} += "R-base-devel R-core R-core-devel R-core-doc R-core-libs R-core-packages R-recommended-packages fontconfig glibc-locale make xdg-utils xorg-x11-fonts-100dpi xorg-x11-fonts-75dpi"

inherit rpm
