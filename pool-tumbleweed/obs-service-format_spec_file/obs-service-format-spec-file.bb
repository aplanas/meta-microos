SUMMARY = "An OBS source service: reformats a spec file to SUSE standard"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
This source service is formating the spec file to SUSE standard. The rational \
behind is to make it easier to review spec files from unknown packagers. \
 \
This should be used in 'trylocal' mode, so that osc is adapting the existing \
spec file instead of creating a new one."
LICENSE = "GPL-2.0-only"

PV = "20230712"

RPM_NAME = "obs-service-format_spec_file-20230712-1.1.noarch.rpm"
RPM_HASH = "9e35121971c8a11e607b7ecf5908bc4d47dc803c37711ed38b8ab4f0671368ff5fe5a0bba5edb589f740014b32659b190e167d5cd5befcc2f8531f67159090a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-format-spec-file"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
obs-service-source-validator"

inherit rpm
