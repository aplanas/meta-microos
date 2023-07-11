SUMMARY = "Functional tools for Python"
DESCRIPTION = "A collection of functional tools focused on practicality. \
 \
Inspired by clojure, underscore and the author's own abstractions."
LICENSE = "BSD-3-Clause"

PV = "1.18"

RPM_NAME = "python311-funcy-1.18-1.4.noarch.rpm"
RPM_HASH = "9841378f046ab1be09c73d9bc722d5f41eb443550e611b0e8227a203f4ff4741e6e3ddac6773045eb982eec0f73f1b51490d80af8d666f1cc1a49ada7eba635b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-funcy \
python3.11dist-funcy \
python311-funcy \
python3dist-funcy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
