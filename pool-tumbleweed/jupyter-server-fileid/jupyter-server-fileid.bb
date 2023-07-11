SUMMARY = "File IDs for documents in a running Jupyter Server -- Jupyter configuration"
DESCRIPTION = "A Jupyter Server extension providing an implementation of the File ID service. \
 \
This subpackage provides the jupyter configuration"
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "jupyter-server-fileid-0.9.0-1.2.noarch.rpm"
RPM_HASH = "56149a42fa37271672f53d84649d413285dfab9c6dbb97d7505e4860ca4813e1b3de75def06106dd719701580529c0c84bc9c68bbe97d3dc5afeb7cf15381493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-server-fileid"

RDEPENDS:${PN} += "python3dist-jupyter-server-fileid"

inherit rpm
