SUMMARY = "Idiomatic assertion toolkit with human-friendly failure messages"
DESCRIPTION = "An idiomatic testing library for python with powerful and flexible assertions. \
Inspired and modeled after RSpec Expectations and should.js."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "python310-surer-0.0.3-2.3.noarch.rpm"
RPM_HASH = "1737ebc1640e2d7cb80514525d382d2f21ab29450840119aebe45d99c2064f571a5a1b142da39a491f021c211bc455e166e47fe5af5c04e5e269608029491741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-surer \
python310-surer \
python3dist-surer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
