SUMMARY = "Temporary changing working directory (chdir)"
DESCRIPTION = "CORE::chdir Cwd:: Guard can change the current directory (chdir) using a \
limited scope."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-Cwd-Guard-0.05-1.23.noarch.rpm"
RPM_HASH = "bbc914e089c98bf918a91a04b0b9dc236a9f5d228aa4694045b76ab560f796851f2b711f388f7d9f9d53412fa2a33997d9c5db4ba1a42b1cf13cbc6c492720a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cwd--Guard \
perl-Cwd-Guard"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-parent"

inherit rpm
