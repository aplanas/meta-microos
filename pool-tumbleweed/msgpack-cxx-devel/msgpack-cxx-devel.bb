SUMMARY = "Development headers for libmsgpack C++ library"
DESCRIPTION = "MessagePack is a binary-based object serialization library. It enables to \
exchange structured objects between many languages like JSON. \
 \
This package provides C++ headers and other devel files."
LICENSE = "BSL-1.0"

PV = "4.1.3"

RPM_NAME = "msgpack-cxx-devel-4.1.3-1.4.aarch64.rpm"
RPM_HASH = "11ab78186eebd299aeab59ff5139478006da408e9deadd18d64a6f80f79a22799fdbaf02bc1bc7a36683baff6e86c3c25725c1a220344fe899bfbc2cef1adec7"

RPROVIDES:${PN} += "cmake-msgpack \
libmsgpack-devel \
msgpack-cxx-devel"

RDEPENDS:${PN} += "libboost-headers-devel \
msgpack-c-devel"

inherit rpm
