SUMMARY = "Django settings using TOML configuration files"
DESCRIPTION = "Django settings using TOML configuration files."
LICENSE = "Apache-2.0"

PV = "0.0.4"

RPM_NAME = "python311-django-settings-toml-0.0.4-1.15.noarch.rpm"
RPM_HASH = "2fa36f50a5144a6cf947e5068319b0706878738536fd40e8404088d1ce254f9f11a849482646c4ea3fbe86a4858f1e4bee5ec4b20e95583594df925ddfdada3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-settings-toml \
python3.11dist-django-settings-toml \
python311-django-settings-toml \
python3dist-django-settings-toml"

RDEPENDS:${PN} += "python-abi \
python311-toml"

inherit rpm
