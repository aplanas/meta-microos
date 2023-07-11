SUMMARY = "Binding replacing OBS service format_spec_file"
DESCRIPTION = "Alternative provider of format_spec_file functionality in order to allow \
user to use spec-cleaner rather than to stick to perl based format_spec_file."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "spec-cleaner-format_spec_file-1.2.1-3.9.noarch.rpm"
RPM_HASH = "b40aae91578ef6c41d6b3d964eb0bae35b115f42347f708e93caa7323b811043bf3993754dbb3df20d5e0211805cfd100907c3cd0c4ee66bcc2902334993b0e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spec-cleaner-format-spec-file"

RDEPENDS:${PN} += "/usr/bin/sh \
spec-cleaner"

inherit rpm
