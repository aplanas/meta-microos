SUMMARY = "Kombu actor framework"
DESCRIPTION = "Actor framework for Kombu"
LICENSE = "BSD-2-Clause"

PV = "0.0.3"

RPM_NAME = "python311-cl-0.0.3-16.5.noarch.rpm"
RPM_HASH = "63617d3b42e287785de8ce810f2911e1b0dae71bfc8624a3a09915b45ff204ea6e8d3b2cac51b4114c9fef1be07a1a9b25de33ced661a5b482a26826eaeadfa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cl \
python3.11dist-cl \
python311-cl \
python3dist-cl"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-kombu \
update-alternatives"

inherit rpm
