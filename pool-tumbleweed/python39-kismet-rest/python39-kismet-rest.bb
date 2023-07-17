SUMMARY = "Python wrapper for the Kismet REST interface"
DESCRIPTION = "Simplified Python API for the Kismet REST interface."
LICENSE = "GPL-2.0"

PV = "2019.05.02"

RPM_NAME = "python39-kismet-rest-2019.05.02-2.1.noarch.rpm"
RPM_HASH = "4e632b0431b4149cfbaca0dbb0e0ea1dae1d049a0d32109dc949551863293a7837acb41bc9e0f63878c082fe33680348bc0a7249ed29d439496ec421350491d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-kismet-rest \
python39-kismet-rest \
python3dist-kismet-rest"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
