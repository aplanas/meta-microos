SUMMARY = "Common utilities for jupyter-contrib projects"
DESCRIPTION = "Common utilities for jupyter-contrib projects. Includes: \
 \
-   providing a notebook-4.2-compatible nbextension API in order to \
    smooth over differences in versions 4.0 and 4.1 \
-   common application components and cli scripts \
-   utility classes and functions for use in tests"
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "python310-jupyter_contrib_core-0.4.2-1.5.noarch.rpm"
RPM_HASH = "9d1d247a1520af3a50dbdeb655a8507998b4cf4a8a5238ec4c784ba28589ebd57c5219db3bef22bd29bbd4f15b96be803e7f82e03f3f6c5c788c3ec20fe068f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-contrib-core \
python310-jupyter-contrib-core \
python3dist-jupyter-contrib-core"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-jupyter-core \
python310-notebook \
python310-setuptools \
python310-tornado \
python310-traitlets \
update-alternatives"

inherit rpm
