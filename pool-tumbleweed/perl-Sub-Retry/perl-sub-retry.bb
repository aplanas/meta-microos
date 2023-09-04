SUMMARY = "Retry $N Times"
DESCRIPTION = "Sub::Retry provides the function named 'retry'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.06"

RPM_NAME = "perl-Sub-Retry-0.06-1.18.noarch.rpm"
RPM_HASH = "ebe13e3e417206b01d22e1452cd6f92864e1ca1c9aaf358622f38055b0330158c850e3c503fa319057c7d601c3fad20da8f24f6f99e52bf5b0b97bf5ae9db59b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Retry \
perl-Sub-Retry"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm
