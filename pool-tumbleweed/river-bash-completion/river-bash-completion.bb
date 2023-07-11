SUMMARY = "Bash Completion for river"
DESCRIPTION = "Bash command-line completion support for river."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g953"

RPM_NAME = "river-bash-completion-0.2.4+g953-1.1.noarch.rpm"
RPM_HASH = "d5e4d8a4b00204bd2becd4a7cb8f686a3a08f5093371a5f0a8fb6efa733e4689052d039df4ae2be5eef2709b265171f5453d719ed1f9dab4d98d49eb545345ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "river-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
