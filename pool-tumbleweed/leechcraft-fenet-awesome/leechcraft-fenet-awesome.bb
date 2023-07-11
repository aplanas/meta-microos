SUMMARY = "Awesome Window Manager integration for LeechCraft"
DESCRIPTION = "This package allows to start Leechcraft as a Desktop Environment with \
the Awesome Window Manager."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-fenet-awesome-0.6.70+git.14794.g33744ae6ce-3.2.noarch.rpm"
RPM_HASH = "ce509d403a9efe057bd9bdd186ab924b42886504106f5d505a3f91515ee6e69fb10bbe6799e8ca21dc7dbeae09f7a03249d5ea5588356a066a0730d59de5bb5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-fenet-awesome \
leechcraft-fenet-wm"

RDEPENDS:${PN} += "/usr/bin/sh \
awesome \
leechcraft-fenet"

inherit rpm
