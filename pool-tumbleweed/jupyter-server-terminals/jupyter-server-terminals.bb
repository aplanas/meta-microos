SUMMARY = "Jupyter Server Extension registration for python*-jupyter-server-terminals"
DESCRIPTION = "A Jupyter Server Extension Providing Terminals. \
This package provides the jupyter server registration"
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "jupyter-server-terminals-0.4.4-1.5.noarch.rpm"
RPM_HASH = "70aa8b7af3330f788f34b6d682d6f74136373c7fa2cae02080024111afd9633f6a3384454bc2be533c3f6bda1ce263623e8fc20e14f9ef4f64505d14034b3ffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-server-terminals"

RDEPENDS:${PN} += ""

inherit rpm
