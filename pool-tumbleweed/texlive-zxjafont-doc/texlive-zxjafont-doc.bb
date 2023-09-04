SUMMARY = "Documentation for texlive-zxjafont"
DESCRIPTION = "This package includes the documentation for texlive-zxjafont"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn62864"

RPM_NAME = "texlive-zxjafont-doc-2023.209.1.3svn62864-53.2.noarch.rpm"
RPM_HASH = "26abbc0d162b5289f44eb49b11b658a5be3fdf68731ee5bec46eccab85a49aa868c324b4e2f6db283e7dad11e78f7367e911e13264e6d8d5573726afe0de691b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zxjafont-doc-ja;en \
texlive-zxjafont-doc"

RDEPENDS:${PN} += ""

inherit rpm
