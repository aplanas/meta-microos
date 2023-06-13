SUMMARY = "Icinga Web 2 vendor library Parsedown"
DESCRIPTION = "Icinga Web 2 vendor library Parsedown."
LICENSE = "MIT"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-Parsedown-2.11.4-2.1.noarch.rpm"
RPM_HASH = "63ef134853a1abc360334d29587b4a97ed1f2918e5d3d8df900c2359f7a8c526d31e3432e7ca0482a6ad488b7c2a5ed441fbce5efead90ac787927cbe793a6f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-Parsedown"

RDEPENDS:${PN} += "icingaweb2-common \
php"

inherit rpm
