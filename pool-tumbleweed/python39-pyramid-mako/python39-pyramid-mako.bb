SUMMARY = "Mako template bindings for the Pyramid web framework"
DESCRIPTION = "Mako template bindings for the Pyramid web framework."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-pyramid-mako-1.1.0-3.10.noarch.rpm"
RPM_HASH = "5fe9ea8df95501822931604c9fbd4e49918a71f6b78c8b0310b4030f32b108c43462bc8f86d19cb9e3a2a40896c18fb49dab4ea8209ccb44f85248f3fdfc55a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyramid-mako \
python39-pyramid-mako \
python3dist-pyramid-mako"

RDEPENDS:${PN} += "python-abi \
python39-Mako \
python39-pyramid"

inherit rpm
