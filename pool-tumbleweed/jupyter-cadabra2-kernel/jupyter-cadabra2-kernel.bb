SUMMARY = "Jupyter kernel for cadabra2"
DESCRIPTION = "Cadabra2 is a computer algebra system (CAS) designed specifically for \
the solution of problems encountered in field theory. \
 \
This package provides a jupyter kernel for cadabra2."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.3.2"

RPM_NAME = "jupyter-cadabra2-kernel-2.4.3.2-1.6.aarch64.rpm"
RPM_HASH = "1cb94c323edfcc4e0d10a626f691fe0be4db5a06821ca37396e62b8d8ca04c6637c792a3996e0336a2e7b00dc873043af47106e745a9fe9c683241c9858acab3"

RPROVIDES:${PN} += "jupyter-cadabra2-kernel"

RDEPENDS:${PN} += "cadabra2 \
jupyter-notebook \
python-abi"

inherit rpm
