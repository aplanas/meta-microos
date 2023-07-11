SUMMARY = "Binary files of pdftex-quiet"
DESCRIPTION = "Binary files of pdftex-quiet"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn49140"

RPM_NAME = "texlive-pdftex-quiet-bin-2023.20230311.svn49140-92.1.aarch64.rpm"
RPM_HASH = "6e3d6642cd76678ed5f88e9bc65d075fda7290f4b92cd11063cb9d49fc3be3554432676d5ee7a8b0eabac8cf5f7ffd33e588159a5b191a07f9c66661fd9c189e"

RPROVIDES:${PN} += "texlive-pdftex-quiet-bin"

RDEPENDS:${PN} += "texlive-pdftex-quiet"

inherit rpm
