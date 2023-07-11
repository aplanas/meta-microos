SUMMARY = "Avocado Plugin to propagate Job results to a remote host"
DESCRIPTION = "This optional plugin is intended to upload the Avocado Job results to \
a dedicated sever."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-result-upload-69.0-6.11.noarch.rpm"
RPM_HASH = "21028a5e30f334d18839cbc16a0e21c60ed23345202038082d7641de92d3a5cd7cd060a32102d19c99390b7231ea3a9654381a02d93c137562b6c17380b8f296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-result-upload \
python3.11dist-avocado-framework-plugin-result-upload \
python3dist-avocado-framework-plugin-result-upload"

RDEPENDS:${PN} += "python-abi \
python3-avocado"

inherit rpm
