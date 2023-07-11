SUMMARY = "Idiomatic assertion toolkit with human-friendly failure messages"
DESCRIPTION = "An idiomatic testing library for python with powerful and flexible assertions. \
Inspired and modeled after RSpec Expectations and should.js."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "python39-surer-0.0.3-2.3.noarch.rpm"
RPM_HASH = "81c2e419f68b0c314e2a4bbb150d28db25cacbf9df28658fb3142b2e9aeea1951ca788ae73ee7c4ae66c4290cad4aa74b63876c24bfd1070e1c660b0812660c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-surer \
python39-surer \
python3dist-surer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
