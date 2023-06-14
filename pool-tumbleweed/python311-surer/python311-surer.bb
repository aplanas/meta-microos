SUMMARY = "Idiomatic assertion toolkit with human-friendly failure messages"
DESCRIPTION = "An idiomatic testing library for python with powerful and flexible assertions. \
Inspired and modeled after RSpec Expectations and should.js."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "python311-surer-0.0.3-1.4.noarch.rpm"
RPM_HASH = "364c7e252e211a6b61cee704d27e8b2146f28b851c11aa756847c69e34f234de78a82536e2788f53c2339ec9d2ba60dbb53f8a617b0fd37c6dc90a6c93d51e37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-surer \
python311-surer \
python3dist-surer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
