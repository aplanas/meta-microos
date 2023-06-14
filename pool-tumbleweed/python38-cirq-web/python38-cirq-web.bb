SUMMARY = "Web-based 3D visualization tools for Cirq"
DESCRIPTION = "Cirq is a Python library for writing, manipulating, and optimizing quantum \
circuits and running them against quantum computers and simulators. \
 \
This package allows users to take advantage of browser based 3D visualization tools \
and features in Cirq. cirq-web also provides a development environment for contributors to create and add \
their own visualizations to the module."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python38-cirq-web-0.13.1-1.5.noarch.rpm"
RPM_HASH = "af00a8d1f2cc1ae2e77c5ae27b8e13d617fbf82b71f669aaed93bc240a294e1565383e5ec403fd70d824a072d218e241234dc54ab2103e5b5781b87939166d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist-cirq-web \
python38-cirq-web \
python3dist-cirq-web"

RDEPENDS:${PN} += "python-abi"

inherit rpm
