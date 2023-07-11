SUMMARY = "Colored strings for terminal usage"
DESCRIPTION = "Crayons is a simple module to give you colored strings for terminal usage. \
Included colors are red, green, yellow, blue, black, magenta, cyan, white, \
and normal."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-crayons-0.4.0-3.10.noarch.rpm"
RPM_HASH = "875d3696f228a17fe494489d56a9d7f84d5cf57273161711b7094c0d09e2d123bfd476bb5cdb2e3f6344a3f26831c9ed270863c9ad7bd452ebc60027b7df758d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-crayons \
python310-crayons \
python3dist-crayons"

RDEPENDS:${PN} += "python-abi \
python310-colorama"

inherit rpm
