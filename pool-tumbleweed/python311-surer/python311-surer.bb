SUMMARY = "Idiomatic assertion toolkit with human-friendly failure messages"
DESCRIPTION = "An idiomatic testing library for python with powerful and flexible assertions. \
Inspired and modeled after RSpec Expectations and should.js."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "python311-surer-0.0.3-2.3.noarch.rpm"
RPM_HASH = "1c555885f17669c5e57fd1e898e936c15b342f800bfa32f57baca5f1f894a2d0b082d719e241be04dd742e55893a599577dcd99a35684981a1871f75df6a7a8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-surer \
python3.11dist-surer \
python311-surer \
python3dist-surer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
