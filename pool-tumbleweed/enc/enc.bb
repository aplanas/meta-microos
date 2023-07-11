SUMMARY = "Modern and friendly alternative to GnuPG"
DESCRIPTION = "Enc is a CLI tool for encryption, a modern and friendly alternative to GnuPG. It is easy to use, secure by default and can encrypt and decrypt files using password or encryption keys, manage and download keys, and sign data. Our goal was to make encryption available to all engineers without the need to learn a lot of new words, concepts, and commands."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "enc-1.1.2-1.2.aarch64.rpm"
RPM_HASH = "a9dd0f1716e9759745f7ee3d274541805b024d7e629208cc2b30640b48c2a7094908e0ce4002fdc563870bfb4d047a03997e373e3f05d52eb501af5117260074"

RPROVIDES:${PN} += "enc"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
