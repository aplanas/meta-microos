SUMMARY = "A Python interface to the R Programming Language"
DESCRIPTION = "RPy is a Python interface to the R Programming Language. It can \
manage all kinds of R objects and can execute arbitrary R functions \
(including the graphic functions). All errors from the R language are \
converted to Python exceptions. Any module installed for the R system \
can be used from Python. \
 \
This code is inspired by RSPython from the Omegahat project."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.4"

RPM_NAME = "python310-rpy2-3.4.4-1.10.noarch.rpm"
RPM_HASH = "441d3a00bae9bbc0289704f0aef95d978bda3949edb1fb92b9aba314f15b3a82c457acb14f94ec43720a1baabded9fb46c3182e628538a452f401aba3932726f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpy2 \
python3.10dist-rpy2 \
python310-rpy2 \
python3dist-rpy2"

RDEPENDS:${PN} += "R-base \
python-abi \
python310-cffi \
python310-numpy \
readline"

inherit rpm
