SUMMARY = "Python3 bindings for sphinxbase"
DESCRIPTION = "Python3 bindings for sphinxbase-0.8 \
 \
CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8"

RPM_NAME = "python3-sphinxbase-0.8-6.6.aarch64.rpm"
RPM_HASH = "5dd6bb541e4f5e49ed9c68920d6ecd3605db0853df82af6ff8ae21677ac1e036c61456da338a6acfd7bdf96ce4368090436d0b7c9989f0c2d28b0d7479c5822a"

RPROVIDES:${PN} += "python3-sphinxbase \
python3.10dist-sphinxbase \
python3dist-sphinxbase"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsphinxbase.so.1 \
python-abi \
sphinxbase"

inherit rpm
