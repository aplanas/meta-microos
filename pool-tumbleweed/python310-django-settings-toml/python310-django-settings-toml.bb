SUMMARY = "Django settings using TOML configuration files"
DESCRIPTION = "Django settings using TOML configuration files."
LICENSE = "Apache-2.0"

PV = "0.0.4"

RPM_NAME = "python310-django-settings-toml-0.0.4-1.15.noarch.rpm"
RPM_HASH = "a0b238c24ca282a95f6b7ecad8474ca229686c99a21d48b95389e8d9178b33521ef5021bae9b6afd343a8a36ea51225d39a57ba4592e98193c444a4facc43837"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-settings-toml \
python310-django-settings-toml \
python3dist-django-settings-toml"

RDEPENDS:${PN} += "python-abi \
python310-toml"

inherit rpm
