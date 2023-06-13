SUMMARY = "Utilities for filesystems, paths, projects, subprocesses, and more"
DESCRIPTION = "Miscellaneous utilities for dealing with filesystems, paths, projects, \
subprocesses, and more."
LICENSE = "ISC"

PV = "0.8.0"

RPM_NAME = "python311-vistir-0.8.0-1.1.noarch.rpm"
RPM_HASH = "51a1c49c5412de75f090830cfe2e5f79d30fea00eadfbf4af4dbb099cca356f1936d8a0a860064636487f80e76da9aa06250dd9fe23a08b57041f738c593fc01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vistir) \
python311-vistir \
python3dist(vistir)"

RDEPENDS:${PN} += "python(abi) \
python311-colorama"

inherit rpm
