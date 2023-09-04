SUMMARY = "Development files for python39-pyzmq"
DESCRIPTION = "Development libraries and headers needed to build software using python39-pyzmq."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.1.1"

RPM_NAME = "python39-pyzmq-devel-25.1.1-1.1.aarch64.rpm"
RPM_HASH = "6af6bb044da4e3f7c457f91b6f02d61a7431d292df00f7cdba2beb191df6b4b689723e8fa2c4cd883deccb47e379ac0c2bd1159214fc231e41490d3f65b0482f"

RPROVIDES:${PN} += "python39-pyzmq-devel"

RDEPENDS:${PN} += "python-abi \
python39-devel \
python39-pyzmq \
zeromq-devel"

inherit rpm
