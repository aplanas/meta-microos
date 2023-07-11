SUMMARY = "Binary files of multibibliography"
DESCRIPTION = "Binary files of multibibliography"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn30534"

RPM_NAME = "texlive-multibibliography-bin-2023.20230311.svn30534-92.1.aarch64.rpm"
RPM_HASH = "a879a2e442e4831f1bcc6c092ae51670dddfc6b2afbc45a7f7071517c4ae2f724f090a6c7c53bef67332f30f184e7676160f47284b83af5e91f0b2c3d0bfee4d"

RPROVIDES:${PN} += "texlive-multibibliography-bin"

RDEPENDS:${PN} += "texlive-multibibliography"

inherit rpm
