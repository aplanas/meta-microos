SUMMARY = "Yomi - Yet one more installer"
DESCRIPTION = "Yomi (yet one more installer) is a new proposal for an installer for \
the [open]SUSE family. It is designed as a SaltStack state, and \
expected to be used in situations were unattended installations for \
heterogeneous nodes is required, and where some bits of intelligence \
in the configuration file, can help to customize the installation. \
 \
Being also a Salt state makes the installation process one more step \
during the provisioning stage, making on Yomi a good candidate for \
integration in any workflow were SaltStack is used."
LICENSE = "Apache-2.0"

PV = "0.0.1+git.1630589391.4557cfd"

RPM_NAME = "yomi-formula-0.0.1+git.1630589391.4557cfd-2.6.noarch.rpm"
RPM_HASH = "0034f8fc14920cd8947d372d3c1631951928a7562d8d7dd248740c8b1ea537ac95ce18a4238bd8a1578b94fdd9d7264c7f60d4e4df4ef103e74acff93f32aaf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-yomi-formula \
yomi-formula"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-base \
salt-formulas-configuration"

inherit rpm
