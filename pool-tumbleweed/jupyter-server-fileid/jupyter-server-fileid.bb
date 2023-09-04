SUMMARY = "File IDs for documents in a running Jupyter Server -- Jupyter configuration"
DESCRIPTION = "A Jupyter Server extension providing an implementation of the File ID service. \
 \
This subpackage provides the jupyter configuration"
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "jupyter-server-fileid-0.9.0-2.1.noarch.rpm"
RPM_HASH = "7d107ef6df2d51f452115d9b1374620b415dd07763155444cefacebe1bd88704ff76fc48072d5af941ff2be81ffb11bd49b6146620745f701c23ef26b253764c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-server-fileid"

RDEPENDS:${PN} += "python3dist-jupyter-server-fileid"

inherit rpm
