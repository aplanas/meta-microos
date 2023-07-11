SUMMARY = "Colored strings for terminal usage"
DESCRIPTION = "Crayons is a simple module to give you colored strings for terminal usage. \
Included colors are red, green, yellow, blue, black, magenta, cyan, white, \
and normal."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-crayons-0.4.0-3.10.noarch.rpm"
RPM_HASH = "b73fd7b599ecb6a1d65b9390263726f0359cdf1121e5c9acc475012f3d0fc16d0e4a1d21dac3d77bc1e6b801bde8b8c5a158e7e1a2ebbbb7253b1ead4bfc64d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crayons \
python3.11dist-crayons \
python311-crayons \
python3dist-crayons"

RDEPENDS:${PN} += "python-abi \
python311-colorama"

inherit rpm
