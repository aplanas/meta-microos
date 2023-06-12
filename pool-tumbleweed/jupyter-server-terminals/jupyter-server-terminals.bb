SUMMARY = "Jupyter Server Extension registration for python*-jupyter-server-terminals"
DESCRIPTION = "A Jupyter Server Extension Providing Terminals. \
This package provides the jupyter server registration"
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "jupyter-server-terminals-0.4.4-1.3.noarch.rpm"
RPM_HASH = "a9bd612b706424183d71530f29febade654c6dcb88b61560c7a67661be290db6b29b7b866eac2adfd3afe8c7ec5a49645ebbc0231025249d42e6fea6eb7bf9d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-server-terminals"
RDEPENDS:${PN} += "(python39-jupyter-server-terminals = 0.4.4 or python311-jupyter-server-terminals = 0.4.4 or python310-jupyter-server-terminals = 0.4.4)"

inherit rpm
