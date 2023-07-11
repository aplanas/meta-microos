SUMMARY = "Functional tools for Python"
DESCRIPTION = "A collection of functional tools focused on practicality. \
 \
Inspired by clojure, underscore and the author's own abstractions."
LICENSE = "BSD-3-Clause"

PV = "1.18"

RPM_NAME = "python310-funcy-1.18-1.4.noarch.rpm"
RPM_HASH = "ef2397ce06138ee93eff3947820d3dfd4fc7ca6bcdb1c4d499082719ca4dcd107f3dc93ee9e5afa61f94eecbc0e8fb2ff504300ab6eaf24395a267ee349afac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-funcy \
python310-funcy \
python3dist-funcy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
