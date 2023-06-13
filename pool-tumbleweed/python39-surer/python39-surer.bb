SUMMARY = "Idiomatic assertion toolkit with human-friendly failure messages"
DESCRIPTION = "An idiomatic testing library for python with powerful and flexible assertions. \
Inspired and modeled after RSpec Expectations and should.js."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "python39-surer-0.0.3-1.4.noarch.rpm"
RPM_HASH = "cebe810169e77782d42fe7d03eed5873eb9dd75e6bec91569e55da549c33e866fd0aec06564e6d2f14644271c89d91c234db1b25a7b380bc711293122e33dabd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(surer) \
python39-surer \
python3dist(surer)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
