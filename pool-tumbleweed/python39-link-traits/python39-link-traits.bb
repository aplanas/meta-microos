SUMMARY = "A fork to traitlets' link and dlink to link traits in addition to traitlets"
DESCRIPTION = "A fork to traitlets' link and dlink to link traits in addition to traitlets."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python39-link-traits-1.0.3-1.13.noarch.rpm"
RPM_HASH = "41b36c39dd731751d1ffabcbf9c3d5a3fb6248c610a19da215bc1ba6798021aac701e0fda0e80312851fe65191aae2b232ac8718b9fa6900bfa4c07a4fdab35e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-link-traits \
python39-link-traits \
python3dist-link-traits"

RDEPENDS:${PN} += "python-abi \
python39-traits"

inherit rpm
