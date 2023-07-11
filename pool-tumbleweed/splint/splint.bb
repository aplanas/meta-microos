SUMMARY = "A tool for statically checking C programs"
DESCRIPTION = "With minimal effort, LCLint can be used as a better lint.  If additional \
effort is invested adding annotations to programs, LCLint can perform \
stronger checks than can be done by any standard lint."
LICENSE = "GPL-2.0+"

PV = "3.1.2"

RPM_NAME = "splint-3.1.2-102.20.aarch64.rpm"
RPM_HASH = "893464d7893a9610ec2b3ab7f18ecc8c2c66bb2d7df1acdb57d838d6a768c0d776e48707b60cf5ca7c8d5099d50c7074a306b638a52e406f55702d9c2b37afe7"

RPROVIDES:${PN} += "splint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfl.so.2"

inherit rpm
