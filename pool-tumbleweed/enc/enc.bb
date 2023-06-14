SUMMARY = "Modern and friendly alternative to GnuPG"
DESCRIPTION = "Enc is a CLI tool for encryption, a modern and friendly alternative to GnuPG. It is easy to use, secure by default and can encrypt and decrypt files using password or encryption keys, manage and download keys, and sign data. Our goal was to make encryption available to all engineers without the need to learn a lot of new words, concepts, and commands."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "enc-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "e374c57075c3bad75b99bbb44c43897698c83d969541c1d9ab9f038816cc564bd32260772c30faba0d0195491df52e9a59664ad9a1bd3e64ea158b933ec45a0e"

RPROVIDES:${PN} += "enc"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
