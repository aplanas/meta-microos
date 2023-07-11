SUMMARY = "Utilities for filesystems, paths, projects, subprocesses, and more"
DESCRIPTION = "Miscellaneous utilities for dealing with filesystems, paths, projects, \
subprocesses, and more."
LICENSE = "ISC"

PV = "0.8.0"

RPM_NAME = "python311-vistir-0.8.0-1.3.noarch.rpm"
RPM_HASH = "1e2bfeb67d67094eb63f7d99aa9e67375e135954d746dcdbe0b37324440a63e27fa69fd287a71172b45608aef22ba2970238e15cceee117c6608a50e93ed1efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vistir \
python3.11dist-vistir \
python311-vistir \
python3dist-vistir"

RDEPENDS:${PN} += "python-abi \
python311-colorama"

inherit rpm
