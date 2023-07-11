SUMMARY = "Common utilities for jupyter-contrib projects"
DESCRIPTION = "Common utilities for jupyter-contrib projects. Includes: \
 \
-   providing a notebook-4.2-compatible nbextension API in order to \
    smooth over differences in versions 4.0 and 4.1 \
-   common application components and cli scripts \
-   utility classes and functions for use in tests"
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "python311-jupyter_contrib_core-0.4.2-1.5.noarch.rpm"
RPM_HASH = "4777a344c253cc6191cef02fe91afb283306d45c3b0572314abc4af4fa89bcdb44c1ec8452fe394cb58bd4ca14bd49ffdc580130145cf235b9adce258dc787a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-contrib-core \
python3-jupyter-contrib-core \
python3.11dist-jupyter-contrib-core \
python311-jupyter-contrib-core \
python3dist-jupyter-contrib-core"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-jupyter-core \
python311-notebook \
python311-setuptools \
python311-tornado \
python311-traitlets \
update-alternatives"

inherit rpm
