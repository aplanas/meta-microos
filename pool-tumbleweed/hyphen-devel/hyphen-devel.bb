SUMMARY = "Files for Developing with hyphen"
DESCRIPTION = "Hyphen is a library for high quality hyphenation and justification. \
 \
This package contains the hyphen development files."
LICENSE = "GPL-2.0+ | LGPL-2.0+ | MPL-1.1+"

PV = "2.8.8"

RPM_NAME = "hyphen-devel-2.8.8-2.26.aarch64.rpm"
RPM_HASH = "78ea683c62ab0885ab263787a029a2cff448577b63f3072860476b713cf7b10dc470f52f5669eb13b7cca0f6851ab0fae9636eb64f2ecb2e81d65927bf60db4c"

RPROVIDES:${PN} += "hyphen-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
libhyphen0"

inherit rpm
