SUMMARY = "Design of experiments for Python"
DESCRIPTION = "The pyDOE2 package is a fork of the pyDOE package that is designed to \
help the scientist, engineer, statistician, etc., to construct \
appropriate experimental designs. \
 \
This fork came to life to solve bugs and issues that remained unsolved in the \
original package."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python310-pyDOE2-1.3.0-2.11.noarch.rpm"
RPM_HASH = "270a0a5cfc60522dd0b3a82e4d48ec719add0cfef05e06c5f6e03257236ee589a250a20aed970c14e89f5724fd4d03568bc2c0d4f116473f3d07f5559d9c3fe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydoe2 \
python310-pyDOE2 \
python3dist-pydoe2"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-scipy"

inherit rpm
