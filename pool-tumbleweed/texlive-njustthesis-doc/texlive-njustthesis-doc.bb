SUMMARY = "Documentation for texlive-njustthesis"
DESCRIPTION = "This package includes the documentation for texlive-njustthesis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.0.1svn62451"

RPM_NAME = "texlive-njustthesis-doc-2023.209.0.0.0.1svn62451-55.1.noarch.rpm"
RPM_HASH = "f99c227a15dc7cf6767159c645353c1b63eb7102c02923b4f5de3575713b560c5f1406a2e54f7915e26864f160abd7011ab7b8728e2fcc29382b10e4ff6652f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-njustthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
