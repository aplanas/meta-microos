SUMMARY = "Online validation of Yubikey OTPs"
DESCRIPTION = "This project implements online validation of Yubikey OTPs.· \
It is written in C and provides a shared library for use by other software."
LICENSE = "BSD-2-Clause"

PV = "2.15"

RPM_NAME = "libykclient-devel-2.15-1.27.aarch64.rpm"
RPM_HASH = "afc6d76c2a9a279b4e3817572d5e4eb810259a59d8f9a323d1a8889c9b13466c3a9bb7ddc2c556f85b771c4dcde58d3e7fed43528b351c3488d6c179ed000a7b"

RPROVIDES:${PN} += "libykclient-devel"

RDEPENDS:${PN} += "glibc-devel \
libykclient3"

inherit rpm
