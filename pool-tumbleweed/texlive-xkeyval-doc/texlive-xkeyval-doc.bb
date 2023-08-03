SUMMARY = "Documentation for texlive-xkeyval"
DESCRIPTION = "This package includes the documentation for texlive-xkeyval"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.9svn63616"

RPM_NAME = "texlive-xkeyval-doc-2023.209.2.9svn63616-53.1.noarch.rpm"
RPM_HASH = "fbe352676de0ad66a736e7f33283a267aa0b17ce516a3e6b6601291e76fe11879a295c32b2febfc2d5a3dd9a105950473125b2477af9e5037489f9b4695fa0b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xkeyval-doc"

RDEPENDS:${PN} += ""

inherit rpm
