SUMMARY = "Python ORM for config files"
DESCRIPTION = "Python ORM for config files."
LICENSE = "LGPL-3.0-only"

PV = "0.1.82"

RPM_NAME = "python39-reconfigure-0.1.82-1.18.noarch.rpm"
RPM_HASH = "940e324b31ce0f9a22304d09b66659ab1dc712bcc9508c9029f53217671e436512c5e94162b073509119022c48de80b13434162b0ba4714e128c89e61da02246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-reconfigure \
python39-reconfigure \
python3dist-reconfigure"

RDEPENDS:${PN} += "python-abi \
python39-chardet"

inherit rpm
