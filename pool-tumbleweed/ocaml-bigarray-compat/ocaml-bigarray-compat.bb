SUMMARY = "Expose Stdlib.Bigarray"
DESCRIPTION = "A library that exposes Stdlib.Bigarray when possible (>= 4.07) but can fallback to Bigarray. The compability bigarray module is exposed under Bigarray_compat."
LICENSE = "ISC"

PV = "1.1.0"

RPM_NAME = "ocaml-bigarray-compat-1.1.0-1.9.aarch64.rpm"
RPM_HASH = "08958fa36a9b17ebdc405f16178cc046b82d01d4fbdd4bf0b34d2e34f1cecca98dfc88124653f72899daea8eb73bb1e6a849421a43d1313efe5b3f0e3aa230dd"

RPROVIDES:${PN} += "ocaml-bigarray-compat \
ocaml-bigarray-compat(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
