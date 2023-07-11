SUMMARY = "Check that a library is available for FFI"
DESCRIPTION = "This module checks whether a particular dynamic library is available for \
FFI to use. It is modeled heavily on Devel::CheckLib, but will find dynamic \
libraries even when development packages are not installed. It also \
provides a find_lib function that will return the full path to the found \
dynamic library, which can be feed directly into FFI::Platypus or another \
FFI system."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.31"

RPM_NAME = "perl-FFI-CheckLib-0.31-1.3.noarch.rpm"
RPM_HASH = "9d28d18bf5c20e3434afe484a77d31241c0e016878fdbbfde4b9ea73456eea6381d4127ee1d4d182d5787c8e90103049c50ced0467213e2d8f186babd631f66f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-FFI--CheckLib \
perl-FFI-CheckLib"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--Which \
perl-List--Util"

inherit rpm
