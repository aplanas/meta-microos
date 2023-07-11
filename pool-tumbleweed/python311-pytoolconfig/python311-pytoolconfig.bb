SUMMARY = "Python tool configuration"
DESCRIPTION = "Python Tool Configuration \
 \
The goal of this project is to manage configuration for python tools, \
such as black and rope and add support for a pyproject.toml configuration file."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python311-pytoolconfig-1.2.4-1.6.noarch.rpm"
RPM_HASH = "18f45e1e5cff936aae05844c203f5311b25bac7be6d2dbfe61b7a456e7ba5ec36daab414c2a0c74afd9283f202ca3532606ffaacf5a762ad9c4be7f72e559e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytoolconfig \
python3.11dist-pytoolconfig \
python311-pytoolconfig \
python3dist-pytoolconfig"

RDEPENDS:${PN} += "python-abi \
python311-packaging"

inherit rpm
