SUMMARY = "Check that a library is available for FFI"
DESCRIPTION = "This module checks whether a particular dynamic library is available for \
FFI to use. It is modeled heavily on Devel::CheckLib, but will find dynamic \
libraries even when development packages are not installed. It also \
provides a find_lib function that will return the full path to the found \
dynamic library, which can be feed directly into FFI::Platypus or another \
FFI system."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.31"

RPM_NAME = "perl-FFI-CheckLib-0.31-1.4.noarch.rpm"
RPM_HASH = "5e5414e6914bf21082d199fd0fac321582b9f1e41838e82b316c0a95bf4879f72120be47a35d5dbd67e3ca74194187205c6ae0981f4b6982fd55c9661cbc261f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-FFI--CheckLib \
perl-FFI-CheckLib"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--Which \
perl-List--Util"

inherit rpm
