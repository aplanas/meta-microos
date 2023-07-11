SUMMARY = "PEP 561 type stubs generator for pybind11 modules"
DESCRIPTION = "Generate stubs for python modules.  There are several tweaks to target \
specifically modules compiled using pybind11"
LICENSE = "BSD-3-Clause"

PV = "0.12.0"

RPM_NAME = "python311-pybind11-stubgen-0.12.0-1.5.noarch.rpm"
RPM_HASH = "43462d4427acf866413f7b939ecdcd82ce1a0cd4d159e8ff679a012e76fc37f9b260c318ccf970309086560ad64ea458406812f13c22454a9094bbd618360ab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybind11-stubgen \
python3.11dist-pybind11-stubgen \
python311-pybind11-stubgen \
python3dist-pybind11-stubgen"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
