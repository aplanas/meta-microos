SUMMARY = "Jupyter kernel for cadabra2"
DESCRIPTION = "Cadabra2 is a computer algebra system (CAS) designed specifically for \
the solution of problems encountered in field theory. \
 \
This package provides a jupyter kernel for cadabra2."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.3.2"

RPM_NAME = "jupyter-cadabra2-kernel-2.4.3.2-1.5.aarch64.rpm"
RPM_HASH = "4d69f88fa9bffa4677e21eed2bc8e9cd5a5763d6b4796a3adcff00e5a3846947ff726accb90bc6648f8779af087d57a7d9a7758346c1648df431b009dd998b9a"

RPROVIDES:${PN} += "jupyter-cadabra2-kernel"

RDEPENDS:${PN} += "cadabra2 \
jupyter-notebook \
python-abi"

inherit rpm
