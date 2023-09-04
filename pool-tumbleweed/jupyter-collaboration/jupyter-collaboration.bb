SUMMARY = "A Jupyter Server Extension Providing Y Documents. -- Jupyter configuration"
DESCRIPTION = "A Jupyter Server Extension Providing Y Documents. \
 \
This subpackage provides the jupyter configuration"
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "jupyter-collaboration-1.0.0-2.1.noarch.rpm"
RPM_HASH = "034a2c8bb325a24249913c44c43533c4b2860c815ee440b75613bf438e48059bf8c125fc1afbc972b7904c56ea852d8f1acc182045b0033c52ec0e5ff7df7ab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-collaboration"

RDEPENDS:${PN} += "python3dist-jupyter-collaboration"

inherit rpm
