SUMMARY = "Adapter to write and run CMPI-type CIM providers in Ruby"
DESCRIPTION = "Adapter to write and run CMPI-type CIM providers in Ruby"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "1.0.4"

RPM_NAME = "cmpi-bindings-ruby-1.0.4-1.2.aarch64.rpm"
RPM_HASH = "610e68ebe3d6c94ceefb702decce82cbc5600fe1b11f69468e0f511a507c292cc47f5d30309280cf39b5e20856c8583641dbcab441ce696ba7d7a5840ec62687"

RPROVIDES:${PN} += "cmpi-bindings \
cmpi-bindings-ruby \
librbCmpiProvider.so"

RDEPENDS:${PN} += "libc.so.6 \
libruby3.2.so.3.2"

inherit rpm
