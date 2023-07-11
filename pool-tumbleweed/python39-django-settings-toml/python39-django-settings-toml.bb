SUMMARY = "Django settings using TOML configuration files"
DESCRIPTION = "Django settings using TOML configuration files."
LICENSE = "Apache-2.0"

PV = "0.0.4"

RPM_NAME = "python39-django-settings-toml-0.0.4-1.15.noarch.rpm"
RPM_HASH = "fc60ca9ac11afb74106dd8230e07f0d83574b1209d0f87718b4a47afea6b53f16b27af45633f3edc8608881d6a9558292a940fd1b5c3a195fa24915a68581296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-settings-toml \
python39-django-settings-toml \
python3dist-django-settings-toml"

RDEPENDS:${PN} += "python-abi \
python39-toml"

inherit rpm
