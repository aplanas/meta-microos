SUMMARY = "Common utilities for jupyter-contrib projects"
DESCRIPTION = "Common utilities for jupyter-contrib projects. Includes: \
 \
-   providing a notebook-4.2-compatible nbextension API in order to \
    smooth over differences in versions 4.0 and 4.1 \
-   common application components and cli scripts \
-   utility classes and functions for use in tests"
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "python39-jupyter_contrib_core-0.4.2-1.4.noarch.rpm"
RPM_HASH = "b11f528adc7fdfd548aa84b9a703d8ecdf7c4c1e50335b07e2769d31918e857c2355e3ddb7f9cc60855e29441732c9189283ee943270d1fe6f1e193ae3b82d3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter-contrib-core) \
python39-jupyter-contrib-core \
python39-jupyter_contrib_core \
python3dist(jupyter-contrib-core)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-jupyter-core \
python39-notebook \
python39-setuptools \
python39-tornado \
python39-traitlets \
update-alternatives"

inherit rpm
