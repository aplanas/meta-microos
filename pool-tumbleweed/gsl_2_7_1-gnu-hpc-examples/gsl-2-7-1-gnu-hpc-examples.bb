SUMMARY = "Examples for the GNU Scientific Library"
DESCRIPTION = "This package contains examples for GSL"
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl_2_7_1-gnu-hpc-examples-2.7.1-2.1.noarch.rpm"
RPM_HASH = "46a20df649c7acd951e8a3340909229b66317a65267742dd6288590533667354d36886b879fdb540af22d9cc2796c090409d406d173dbf9a090110c5adea81dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-2-7-1-gnu-hpc-examples"

RDEPENDS:${PN} += ""

inherit rpm
