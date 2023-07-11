SUMMARY = "PEP 561 type stubs generator for pybind11 modules"
DESCRIPTION = "Generate stubs for python modules.  There are several tweaks to target \
specifically modules compiled using pybind11"
LICENSE = "BSD-3-Clause"

PV = "0.12.0"

RPM_NAME = "python310-pybind11-stubgen-0.12.0-1.5.noarch.rpm"
RPM_HASH = "8d974599061d83c6c7a8b1e68abd51d8e81ec823f78637e4a60ae2a38da7b81c35a619bfceb54b0113d5075a39c63166b4c9da73428d683668c73ff27ec18954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pybind11-stubgen \
python310-pybind11-stubgen \
python3dist-pybind11-stubgen"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
