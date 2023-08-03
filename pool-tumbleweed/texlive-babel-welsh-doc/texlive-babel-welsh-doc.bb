SUMMARY = "Documentation for texlive-babel-welsh"
DESCRIPTION = "This package includes the documentation for texlive-babel-welsh"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn38372"

RPM_NAME = "texlive-babel-welsh-doc-2023.209.1.1asvn38372-54.1.noarch.rpm"
RPM_HASH = "d5458e41fbb7d90788d3f271aef1e94e718f7a14b7f4b4e2434ad13030a3e7d1fe872d5047aaa36c08fd5100b79694ee7009e53fcdcc23086c428671d4d885da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-welsh-doc"

RDEPENDS:${PN} += ""

inherit rpm
