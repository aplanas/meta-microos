SUMMARY = "Utility to find python versions on your system"
DESCRIPTION = "Discover which versions of the Python interpreter are present on your \
system."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "python39-findpython-0.2.5-2.1.noarch.rpm"
RPM_HASH = "f1e8b6351e795fcc4e3db4f60ef5b99294993f5c49cf3dcaeec9dbbd5b600b972c75a8b7e0ff63d9116bd2b873bb3fa2140698a0d596ae9ef31e8492b7bc4683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-findpython \
python39-findpython \
python3dist-findpython"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-packaging \
update-alternatives"

inherit rpm
