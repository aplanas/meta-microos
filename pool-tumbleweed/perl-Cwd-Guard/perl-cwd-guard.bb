SUMMARY = "Temporary changing working directory (chdir)"
DESCRIPTION = "CORE::chdir Cwd:: Guard can change the current directory (chdir) using a \
limited scope."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-Cwd-Guard-0.05-1.24.noarch.rpm"
RPM_HASH = "8abbf5d627730fe1787daf75bf2af34132806ca1529bccf125ff5e970f8a211ea31ab1cc3758d65a1ce547c758e156b8f1fa2956acca9f984a81eb28bc8ce1e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cwd--Guard \
perl-Cwd-Guard"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm
