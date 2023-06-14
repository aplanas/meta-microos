SUMMARY = "Avocado Plugin to propagate Job results to a remote host"
DESCRIPTION = "This optional plugin is intended to upload the Avocado Job results to \
a dedicated sever."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-result-upload-69.0-6.10.noarch.rpm"
RPM_HASH = "a7dc23fcbb38d8dcc1d3fa733ffff6112878fb62eee1aad93764451202c1dceb5c895a630dc7b1cc4c69bbd1d8cf84c85634f92ba5ba6f90923b498404f0b6b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-result-upload \
python3.10dist-avocado-framework-plugin-result-upload \
python3dist-avocado-framework-plugin-result-upload"

RDEPENDS:${PN} += "python-abi \
python3-avocado"

inherit rpm
