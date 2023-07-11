SUMMARY = "Python Promises"
DESCRIPTION = "Promises implementation for python."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "python39-vine-5.0.0-3.3.noarch.rpm"
RPM_HASH = "63baa434d3f0239b39f028b2228a00ae327f83be088be4601d3228c3aa82e3b8a0d4b0655bc0abd32dc5587f3d965e6bb40960384a1a5d3170ae64ce4384735f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vine \
python39-vine \
python3dist-vine"

RDEPENDS:${PN} += "python-abi"

inherit rpm
