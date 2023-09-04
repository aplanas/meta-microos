SUMMARY = "Documentation for texlive-epsf-dvipdfmx"
DESCRIPTION = "This package includes the documentation for texlive-epsf-dvipdfmx"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2014svn35575"

RPM_NAME = "texlive-epsf-dvipdfmx-doc-2023.209.2014svn35575-54.2.noarch.rpm"
RPM_HASH = "ee4c011ae2094def7ee9436a3a73208dbaeccdc95e3ed3ecb63f6dbded35fb1171f8dd2d5242257a335b09b001394cc57be38fb1ab2b32ec7b33af135d171390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsf-dvipdfmx-doc"

RDEPENDS:${PN} += ""

inherit rpm
