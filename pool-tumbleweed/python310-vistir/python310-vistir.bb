SUMMARY = "Utilities for filesystems, paths, projects, subprocesses, and more"
DESCRIPTION = "Miscellaneous utilities for dealing with filesystems, paths, projects, \
subprocesses, and more."
LICENSE = "ISC"

PV = "0.8.0"

RPM_NAME = "python310-vistir-0.8.0-1.1.noarch.rpm"
RPM_HASH = "0935d33f8842662f688dc70cee226efeb73e78fd1517105062f5bd2c6958b7b7052d0499bdd3dfa8ccdb7c0a4352f07234a6001856349dbe83e905b4bec8432e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vistir \
python3.10dist-vistir \
python310-vistir \
python3dist-vistir"

RDEPENDS:${PN} += "python-abi \
python310-colorama"

inherit rpm
