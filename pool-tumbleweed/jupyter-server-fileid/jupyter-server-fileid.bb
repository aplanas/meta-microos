SUMMARY = "File IDs for documents in a running Jupyter Server -- Jupyter configuration"
DESCRIPTION = "A Jupyter Server extension providing an implementation of the File ID service. \
 \
This subpackage provides the jupyter configuration"
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "jupyter-server-fileid-0.9.0-1.1.noarch.rpm"
RPM_HASH = "52a55017ab0eab2cedf123997b06b0ab8e10a0344e22e89ff78380b5f322f99107a47695ca05fd62387e09b5443ddf3ef465f6f8fd71ab02c6470fdf17030e22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-server-fileid \
jupyter_server_fileid"

RDEPENDS:${PN} += "python3dist(jupyter-server-fileid)"

inherit rpm
