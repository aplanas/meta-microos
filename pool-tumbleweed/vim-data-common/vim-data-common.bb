SUMMARY = "Common Data files for vim & gvim"
DESCRIPTION = "This package contains basic runtime & syntax files for vim"
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "vim-data-common-9.0.1632-1.1.noarch.rpm"
RPM_HASH = "ce6245af6829c2d0ef26db3e950ce713076f4f26667ae2366c256f5f75b71a86731b0e4b85ad88faa84fd5203a583d487b6cfe7c0c76a05f57991154b3c0be46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-data-common"

RDEPENDS:${PN} += ""

inherit rpm
