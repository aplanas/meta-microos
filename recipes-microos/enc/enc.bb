SUMMARY = "Modern and friendly alternative to GnuPG"
DESCRIPTION = "Enc is a CLI tool for encryption, a modern and friendly alternative to GnuPG. It is easy to use, secure by default and can encrypt and decrypt files using password or encryption keys, manage and download keys, and sign data. Our goal was to make encryption available to all engineers without the need to learn a lot of new words, concepts, and commands."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "enc-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "b7fa0ff4517da7cdb54d887ffd824d46563c7e009462e7ce4cdc86f32c7af702696c5a951892a01efe4b58e81445ccafdf22524c6ddfae175604fce87fa2e808"

RPROVIDES:${PN} += "enc enc(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
