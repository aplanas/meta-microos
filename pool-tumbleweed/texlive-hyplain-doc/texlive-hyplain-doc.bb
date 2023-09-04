SUMMARY = "Documentation for texlive-hyplain"
DESCRIPTION = "This package includes the documentation for texlive-hyplain"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-hyplain-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "6b38657a05ec5e39f4db4663801dbbff58e827ffcd6396a0c69a90a877099bb7393714b5060c66ae7c93fae534f11adb48b077399e8a28ead40df36e8fb68194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyplain-doc"

RDEPENDS:${PN} += ""

inherit rpm
