SUMMARY = "PEP 561 type stubs generator for pybind11 modules"
DESCRIPTION = "Generate stubs for python modules.  There are several tweaks to target \
specifically modules compiled using pybind11"
LICENSE = "BSD-3-Clause"

PV = "0.12.0"

RPM_NAME = "python311-pybind11-stubgen-0.12.0-1.4.noarch.rpm"
RPM_HASH = "bdacca8d51cff6f1b88cb2bf35015fe8060c9b3c803c157baa31503423a3608ad7f09a74222c02f691ea0829f567057702408b78e098153252919b2c86dc6cd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pybind11-stubgen \
python311-pybind11-stubgen \
python3dist-pybind11-stubgen"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
update-alternatives"

inherit rpm
