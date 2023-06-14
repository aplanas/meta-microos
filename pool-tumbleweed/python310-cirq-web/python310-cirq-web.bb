SUMMARY = "Web-based 3D visualization tools for Cirq"
DESCRIPTION = "Cirq is a Python library for writing, manipulating, and optimizing quantum \
circuits and running them against quantum computers and simulators. \
 \
This package allows users to take advantage of browser based 3D visualization tools \
and features in Cirq. cirq-web also provides a development environment for contributors to create and add \
their own visualizations to the module."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python310-cirq-web-0.13.1-1.5.noarch.rpm"
RPM_HASH = "3ed76b79f0ebe364ce26f29f93cba6bf7225114bf3a278bb2dd13fd1ea60b2646a94c34fc76c67fbf114f202b79451badcfdfc10383e63bc8301dfb795decb79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cirq-web \
python3.10dist-cirq-web \
python310-cirq-web \
python3dist-cirq-web"

RDEPENDS:${PN} += "python-abi"

inherit rpm
