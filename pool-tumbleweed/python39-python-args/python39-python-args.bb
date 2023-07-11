SUMMARY = "Python argument design patterns in a composable interface"
DESCRIPTION = "Python argument design patterns in a composable interface."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "python39-python-args-1.0.2-1.13.noarch.rpm"
RPM_HASH = "1d77aac29b66a689e5067385c1195d1e60e9c314a5e453a4b8459f8bc021df341c4eb6cc61ec5acaabdb61825a3769ad00df7d5498ddc5db0463b7b5202384b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-args \
python39-python-args \
python3dist-python-args"

RDEPENDS:${PN} += "python-abi"

inherit rpm
