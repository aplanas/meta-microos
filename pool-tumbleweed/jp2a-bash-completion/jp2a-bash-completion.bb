SUMMARY = "Bash completions scripts for jp2a"
DESCRIPTION = "This package contains the bash completions scripts for jp2a."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "jp2a-bash-completion-1.1.1-2.8.noarch.rpm"
RPM_HASH = "76bd46d5c02bb594f11fd45c43bc48d9c7d825dfa23593fef1b9c6eed38fd3234bd0d83873bb7f2fd15663061d0214ac53b9df8131f99547167bd49ec52fb235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jp2a-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
