SUMMARY = "Documentation for python-mpi4py"
DESCRIPTION = "Documentation files and demos for python-mpi4py."
LICENSE = "BSD-2-Clause"

PV = "3.1.4"

RPM_NAME = "python-mpi4py-doc-3.1.4-2.5.aarch64.rpm"
RPM_HASH = "a763aa4cc4bd5447058d01b482e54fc52b7636fe1f2846fa2fc91fe32704eb58f7f0e31b1ad67396912d0cde2c645f94eba3be64a00f94031ca43a7c0eddfd7f"

RPROVIDES:${PN} += "python-mpi4py-doc \
python310-mpi4py-doc \
python311-mpi4py-doc \
python39-mpi4py-doc"

RDEPENDS:${PN} += ""

inherit rpm
