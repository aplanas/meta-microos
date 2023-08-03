SUMMARY = "Documentation for texlive-koma-script-sfs"
DESCRIPTION = "This package includes the documentation for texlive-koma-script-sfs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn26137"

RPM_NAME = "texlive-koma-script-sfs-doc-2023.209.1.0svn26137-56.1.noarch.rpm"
RPM_HASH = "d42d5272cecce9edb7572e14515bed3a60eb4c5da32d97e4cfd297c437278b7b6d36974a655a4b4e09019dd8d4316e4f5bbfaa6b082eccb55ba20d7113d068f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-koma-script-sfs-doc-fi \
texlive-koma-script-sfs-doc"

RDEPENDS:${PN} += ""

inherit rpm
