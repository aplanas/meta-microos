SUMMARY = "Documentation for python-mpi4py"
DESCRIPTION = "Documentation files and demos for python-mpi4py."
LICENSE = "BSD-2-Clause"

PV = "3.1.4"

RPM_NAME = "python-mpi4py-doc-3.1.4-2.7.aarch64.rpm"
RPM_HASH = "5b06318852341a651bbd64271a329794011cb337d4ca9111cd8bd756c5a6fd97b663d8fdf29bb240887aa6a7f016b50c3bd6d91a7fd6d3c262cdd4a60ed987ed"

RPROVIDES:${PN} += "python-mpi4py-doc \
python310-mpi4py-doc \
python311-mpi4py-doc \
python39-mpi4py-doc"

RDEPENDS:${PN} += ""

inherit rpm
