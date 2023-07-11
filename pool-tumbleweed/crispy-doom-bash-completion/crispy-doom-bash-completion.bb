SUMMARY = "Crispy Doom command line completion support for bash"
DESCRIPTION = "Additions for bash-completion to support crispy-doom."
LICENSE = "GPL-2.0-or-later"

PV = "5.12.0"

RPM_NAME = "crispy-doom-bash-completion-5.12.0-1.2.noarch.rpm"
RPM_HASH = "195fd1d8e6a53b4a3809f8c3657a7a445bf065a20f64913e4e954448e1821b36ae1a12715df0447b4f121413aeeb9eb2c4608885caea61d825ba19ee46574bf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crispy-doom-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
