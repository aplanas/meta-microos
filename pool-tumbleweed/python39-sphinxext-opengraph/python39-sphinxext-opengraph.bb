SUMMARY = "Sphinx Extension to enable OGP support"
DESCRIPTION = "Sphinx Extension to enable OGP support"
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python39-sphinxext-opengraph-0.7.5-1.3.noarch.rpm"
RPM_HASH = "b63115c8ecef682470609c27d6e874b27b4e1ab342624cf917a261c59675be247e22df9139f5e9fde2cb1a883767067cc59b1224abf6c653a1c7d98fb544dce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxext-opengraph) \
python39-sphinxext-opengraph \
python3dist(sphinxext-opengraph)"
RDEPENDS:${PN} += "python(abi) \
python3-Sphinx"

inherit rpm
