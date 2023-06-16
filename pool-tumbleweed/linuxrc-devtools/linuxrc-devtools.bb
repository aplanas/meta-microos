SUMMARY = "Tools to submit from Git to OBS via Jenkins"
DESCRIPTION = "This is a collection of scripts used to connect github via jenkins to the \
open build service."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "linuxrc-devtools-1.1-1.2.noarch.rpm"
RPM_HASH = "fd0acce222632a508690bca504b9a37264ab6c4a3a0c111c90087dc71ecbc54aef15810df2c76b8b4f4fe4d2595a41261b246d16c4c63d88e1fa3c7a78ccdc49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linuxrc-devtools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl"

inherit rpm
