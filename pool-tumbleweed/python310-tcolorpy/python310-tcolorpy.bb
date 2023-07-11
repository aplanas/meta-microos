SUMMARY = "Python library to apply true color for terminal text"
DESCRIPTION = "A Python library to apply true color for terminal text."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-tcolorpy-0.1.2-1.5.noarch.rpm"
RPM_HASH = "f29251898cf8f25afe430d9a337ff276ded343353f6ea5715222d48be08d570ea732442b91311befbd260a24aaa7e9358df0526b11c2cdb44409eb02b647ec07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tcolorpy \
python310-tcolorpy \
python3dist-tcolorpy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
