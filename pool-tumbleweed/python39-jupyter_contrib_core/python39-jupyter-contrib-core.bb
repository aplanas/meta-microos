SUMMARY = "Common utilities for jupyter-contrib projects"
DESCRIPTION = "Common utilities for jupyter-contrib projects. Includes: \
 \
-   providing a notebook-4.2-compatible nbextension API in order to \
    smooth over differences in versions 4.0 and 4.1 \
-   common application components and cli scripts \
-   utility classes and functions for use in tests"
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "python39-jupyter_contrib_core-0.4.2-1.5.noarch.rpm"
RPM_HASH = "0a4cbfe625c3181664f99488c4d357af67519a7a8a3940762f6df5e9bc239ae96ee3e3287018b767a53522d9ac0267d0d9ba3afe437007af128ba7a544b53aed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-contrib-core \
python39-jupyter-contrib-core \
python3dist-jupyter-contrib-core"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-jupyter-core \
python39-notebook \
python39-setuptools \
python39-tornado \
python39-traitlets \
update-alternatives"

inherit rpm
