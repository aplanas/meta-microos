SUMMARY = "Keylime registrar service"
DESCRIPTION = "Subpackage of keylime for registrar service."
LICENSE = "Apache-2.0 & MIT"

PV = "7.2.5"

RPM_NAME = "keylime-registrar-7.2.5-1.3.noarch.rpm"
RPM_HASH = "624fa61b12f6876c66146d145842a955d3782227aa709d68c95792081c8e4a8b6d7c0f3e8f48da8d58104d46089d27288da4d019829df188ecb50475f439df26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-registrar"

RDEPENDS:${PN} += "/usr/bin/sh \
keylime-config \
keylime-logrotate \
keylime-tpm-cert-store \
python3-keylime"

inherit rpm
