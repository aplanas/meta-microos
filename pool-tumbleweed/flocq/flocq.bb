SUMMARY = "Formalization of floating point numbers for Coq"
DESCRIPTION = "Flocq (Floats for Coq) is a floating-point formalization for the Coq \
system.  It provides a comprehensive library of theorems on a \
multi-radix multi-precision arithmetic.  It also supports efficient \
numerical computations inside Coq."
LICENSE = "LGPL-3.0-or-later"

PV = "4.1.1"

RPM_NAME = "flocq-4.1.1-1.3.aarch64.rpm"
RPM_HASH = "419f7c5298afe3aba2cb1d92f5519b775776a0b67b00446705bcbba4429e50e3520aeaa1c3050961edccc74b6c089186e25176620e42545e2de9a37de245a591"

RPROVIDES:${PN} += "flocq \
flocq(aarch-64)"

RDEPENDS:${PN} += "coq"

inherit rpm
