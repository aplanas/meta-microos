SUMMARY = "Development files for libexmdbpp"
DESCRIPTION = "The library provides a C++ API and implementation for constructing \
exmdb protocol requests and responses and conversing with a server. \
 \
This subpackage contains the header files for the library."
LICENSE = "AGPL-3.0-or-later"

PV = "1.11.0.58baa16"

RPM_NAME = "libexmdbpp-devel-1.11.0.58baa16-1.1.aarch64.rpm"
RPM_HASH = "84707c8434484460a131ba8e253abf47d1a2feb4c74521cb2517d1f3e10477318301c2e745049a802784563f46026150135d9848554b045799f5c493093725fa"

RPROVIDES:${PN} += "libexmdbpp-devel"

RDEPENDS:${PN} += "libexmdbpp0"

inherit rpm
