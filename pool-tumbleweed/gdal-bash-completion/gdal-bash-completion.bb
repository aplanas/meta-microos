SUMMARY = "Bash completion for GDAL"
DESCRIPTION = "bash command line completion support for GDAL"
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "gdal-bash-completion-3.6.3-2.4.noarch.rpm"
RPM_HASH = "c2ff28337a96063ab237b5cfe10c9e7b9169960909200cead28318aeed57bdada0eee6ba56b141f79154ce7aceddffb39a0994039fcd997c098c4b52f302666b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdal-bash-completion"

RDEPENDS:${PN} += "bash-completion \
gdal"

inherit rpm
