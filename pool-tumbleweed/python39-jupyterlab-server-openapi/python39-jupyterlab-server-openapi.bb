SUMMARY = "The jupyterlab_server[openapi]] extra"
DESCRIPTION = "Metapackage for the jupyterlab_server[openapi] extra"
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python39-jupyterlab-server-openapi-2.22.1-1.2.noarch.rpm"
RPM_HASH = "bb06d3484f388ce0a347279929673052b5903d123fb8dc7534ee8c1721510d41240533b23211839909e73417965f98dfb5e7033b76340e0ea2bece3aa3165490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyterlab-server-openapi"

RDEPENDS:${PN} += "-python39-openapi-core >= 0.16.1 with python39-openapi-core < 0.17 \
python39-jupyterlab-server \
python39-ruamel.yaml"

inherit rpm
