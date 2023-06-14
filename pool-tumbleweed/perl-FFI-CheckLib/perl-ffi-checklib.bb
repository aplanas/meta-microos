SUMMARY = "Check that a library is available for FFI"
DESCRIPTION = "This module checks whether a particular dynamic library is available for \
FFI to use. It is modeled heavily on Devel::CheckLib, but will find dynamic \
libraries even when development packages are not installed. It also \
provides a find_lib function that will return the full path to the found \
dynamic library, which can be feed directly into FFI::Platypus or another \
FFI system."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.31"

RPM_NAME = "perl-FFI-CheckLib-0.31-1.2.noarch.rpm"
RPM_HASH = "e9e047d0c5eec2657fd12098466420848a6f63f87a799a8c63fbac2a3ede09b720b065a280633b7987347218a2f2d92794d53a4d11d17caa88986008ff0f2613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-FFI--CheckLib \
perl-FFI-CheckLib"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-File--Which \
perl-List--Util"

inherit rpm
