SUMMARY = "Moose in a box"
DESCRIPTION = "This Task installs Moose and then optionally installs a number of Moose \
extensions listed below. This list is meant to be comprehensive, so if I \
missed something please let me know."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Task-Moose-0.03-10.21.noarch.rpm"
RPM_HASH = "25c2e05244c1a7c91a6ca30d6d7b2c5472d80c469c0678bd4d983add07d082244257bed716b7dffb276901837bf3c100918bbaf838d4dae10fdb8ae24cbfbc87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Task--Moose \
perl-Task-Moose"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose"

inherit rpm
