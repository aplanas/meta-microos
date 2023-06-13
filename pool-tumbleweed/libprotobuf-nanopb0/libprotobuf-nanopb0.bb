SUMMARY = "Shared library for nanopb"
DESCRIPTION = "Shared library for nanopb - a C implementation of Google's Protocol Buffers \
data format."
LICENSE = "Zlib"

PV = "0.4.6"

RPM_NAME = "libprotobuf-nanopb0-0.4.6-2.3.aarch64.rpm"
RPM_HASH = "44a3bcc18a8f2c182a8ef980fd86b14d2f7c2ed3106d8e6648779616e57bc63a99799f31b3be4bdab0bdacd73911ac29eb64596e8eddf568597ed26c6876b61e"

RPROVIDES:${PN} += "libprotobuf-nanopb.so.0()(64bit) \
libprotobuf-nanopb0 \
libprotobuf-nanopb0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
