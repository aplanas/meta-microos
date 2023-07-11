SUMMARY = "Read support for dbf files for agate"
DESCRIPTION = "Agate-dbf adds read support for dbf files to agate."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python310-agate-dbf-0.2.2-1.12.noarch.rpm"
RPM_HASH = "43c2ab398d787c65c8439436379920842c1f53243b9651ed5132148dbe6722c00328a78d61d98e9ea900807546469be61a7f6a4efa51eee71c9ccaa35b981a3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-agate-dbf \
python310-agate-dbf \
python3dist-agate-dbf"

RDEPENDS:${PN} += "python-abi \
python310-agate \
python310-dbfread"

inherit rpm
