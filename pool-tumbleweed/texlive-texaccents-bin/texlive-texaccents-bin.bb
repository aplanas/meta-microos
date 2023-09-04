SUMMARY = "Binary files of texaccents"
DESCRIPTION = "Binary files of texaccents"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn64447"

RPM_NAME = "texlive-texaccents-bin-2023.20230311.svn64447-93.2.aarch64.rpm"
RPM_HASH = "f326b6c1105179c56334b3ddda1525b30ffd5d8f1f4fd4bc7c1b778386063f24c0f6b04f30ebeb6805ad82f152bac567798d8d03897942e3ed36de10fd892c5b"

RPROVIDES:${PN} += "texlive-texaccents-bin"

RDEPENDS:${PN} += "texlive-texaccents"

inherit rpm
