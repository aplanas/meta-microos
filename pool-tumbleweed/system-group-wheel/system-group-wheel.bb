SUMMARY = "System group 'wheel'"
DESCRIPTION = "This package provides the system group 'wheel'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-group-wheel-20170617-24.16.noarch.rpm"
RPM_HASH = "544e22892f6cfc5d57aff7cb0adca5425182d2c47b3cabb435ca1c48e4448b999d6dd3340c7d9a520edc389ef4dd90cadcaa76871d76ddcbf46bf7594de5db3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-wheel \
system-group-wheel"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
