SUMMARY = "Editable installations"
DESCRIPTION = "A Python library for creating 'editable wheels' \
 \
This library supports the building of wheels which, when installed, will expose \
packages in a local directory on sys.path in 'editable mode'. In other words, \
changes to the package source will be reflected in the package visible to \
Python, without needing a reinstall."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python39-editables-0.5-1.1.noarch.rpm"
RPM_HASH = "4026980649e61ab66665c9536d7928bcecb44a8961226e826ea09d2453807375f5e3d3935245da73dde92e5b64dae09fe27de00dd7f0fdea62750ff907a7302a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-editables \
python39-editables \
python3dist-editables"

RDEPENDS:${PN} += "python-abi"

inherit rpm
