SUMMARY = "Documentation for texlive-xcjk2uni"
DESCRIPTION = "This package includes the documentation for texlive-xcjk2uni"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54958"

RPM_NAME = "texlive-xcjk2uni-doc-2023.201.1.0svn54958-52.2.noarch.rpm"
RPM_HASH = "ff9de3bf43423961cd9023b6273845b585f7ad76fd9a19836e0f87e7aeba7f2a05fd18130310a167986ae6abf3467bfef19a568986dd85522b63496b658c34fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xcjk2uni-doc-zh \
texlive-xcjk2uni-doc"

RDEPENDS:${PN} += ""

inherit rpm
