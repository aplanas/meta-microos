SUMMARY = "The 'Boltons' utility package for Python"
DESCRIPTION = "Boltons is a package containing over 160 utility types and functions \
that can be used as a package or independently. Documentation is on \
http://boltons.readthedocs.org."
LICENSE = "BSD-3-Clause"

PV = "21.0.0"

RPM_NAME = "python39-boltons-21.0.0-2.5.noarch.rpm"
RPM_HASH = "02cae51ce255a67dc432ed75987e13b3092329ca1c60d2ed7abcb25bad498440616fcdb369b89283d49ca31165310f5b53a5957fdbab28d0aff35549546e1b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-boltons \
python39-boltons \
python3dist-boltons"

RDEPENDS:${PN} += "python-abi"

inherit rpm
