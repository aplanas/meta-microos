SUMMARY = "Documentation for texlive-lkproof"
DESCRIPTION = "This package includes the documentation for texlive-lkproof"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.1svn20021"

RPM_NAME = "texlive-lkproof-doc-2023.209.3.1svn20021-55.1.noarch.rpm"
RPM_HASH = "601cd6f760b9bf50a05579ddc11ef0f909e5ffe35293fa2386701ffc432d905dc8a58aa6ede22e970e7da83c1cae6fcc1fd1d80ab7f8bf94627cbbf19f761305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lkproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
