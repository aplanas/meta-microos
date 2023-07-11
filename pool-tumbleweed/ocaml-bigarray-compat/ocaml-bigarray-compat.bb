SUMMARY = "Expose Stdlib.Bigarray"
DESCRIPTION = "A library that exposes Stdlib.Bigarray when possible (>= 4.07) but can fallback to Bigarray. The compability bigarray module is exposed under Bigarray_compat."
LICENSE = "ISC"

PV = "1.1.0"

RPM_NAME = "ocaml-bigarray-compat-1.1.0-1.10.aarch64.rpm"
RPM_HASH = "792d26ff21c4977d303f757922099ce13e152f7655a541235c3aa3180d734ee7e5bab768aa249f0e1edf141f6cc72e18f1654382d3b483f9b966cfbb8611fede"

RPROVIDES:${PN} += "ocaml-bigarray-compat"

RDEPENDS:${PN} += ""

inherit rpm
