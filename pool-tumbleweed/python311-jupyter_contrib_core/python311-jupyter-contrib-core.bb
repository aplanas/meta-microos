SUMMARY = "Common utilities for jupyter-contrib projects"
DESCRIPTION = "Common utilities for jupyter-contrib projects. Includes: \
 \
-   providing a notebook-4.2-compatible nbextension API in order to \
    smooth over differences in versions 4.0 and 4.1 \
-   common application components and cli scripts \
-   utility classes and functions for use in tests"
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "python311-jupyter_contrib_core-0.4.2-1.4.noarch.rpm"
RPM_HASH = "a4010bdcd1d5e4e6ede6420b4dff0916ea009de10f2edc14dd0343bbd5f9c5d900a8a9e00c1347a3fcb1ac0b370b6b6f5708899d88cc03e0a6e2d2477658e1fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyter-contrib-core) \
python311-jupyter-contrib-core \
python311-jupyter_contrib_core \
python3dist(jupyter-contrib-core)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-jupyter-core \
python311-notebook \
python311-setuptools \
python311-tornado \
python311-traitlets \
update-alternatives"

inherit rpm
