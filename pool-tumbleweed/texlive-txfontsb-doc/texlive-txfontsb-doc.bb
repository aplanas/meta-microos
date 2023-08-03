SUMMARY = "Documentation for texlive-txfontsb"
DESCRIPTION = "This package includes the documentation for texlive-txfontsb"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1.1svn54512"

RPM_NAME = "texlive-txfontsb-doc-2023.209.1.1.1svn54512-53.1.noarch.rpm"
RPM_HASH = "75d967c1bbe29f9e2d5fcea8c0a614fb3290cf1fd9861728c54308dc319de21408775481e8e6130b48dba3537428765f33571fc9a9db44f4d48dc35f3ac4aa18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-txfontsb-doc"

RDEPENDS:${PN} += ""

inherit rpm
