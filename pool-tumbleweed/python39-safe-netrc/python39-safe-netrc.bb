SUMMARY = "Safe netrc file parser"
DESCRIPTION = "This package provides a subclass of the Python standard library netrc.netrc \
class to add some custom behaviors."
LICENSE = "GPL-2.0+"

PV = "1.0.0"

RPM_NAME = "python39-safe-netrc-1.0.0-1.4.noarch.rpm"
RPM_HASH = "5b533ad6e2cbd2a4d483273fb0e783500bc643d072642beda6fb40e3947c104438fd79c1801a8f32cff8b4974d6bfa455577d2778940ec6029956228a78a0ac3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-safe-netrc \
python39-safe-netrc \
python3dist-safe-netrc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
