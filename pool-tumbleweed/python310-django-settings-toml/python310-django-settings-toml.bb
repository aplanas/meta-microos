SUMMARY = "Django settings using TOML configuration files"
DESCRIPTION = "Django settings using TOML configuration files."
LICENSE = "Apache-2.0"

PV = "0.0.4"

RPM_NAME = "python310-django-settings-toml-0.0.4-1.13.noarch.rpm"
RPM_HASH = "29b0473b6c9b924c437e16d7f2dd949f2a88eb6907ec748c6a891932ffb78da07ad2771d3764154239bca7df0e023b8c9ed0c7ac8776588272285a46d39686cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-settings-toml \
python3.10dist(django-settings-toml) \
python310-django-settings-toml \
python3dist(django-settings-toml)"

RDEPENDS:${PN} += "python(abi) \
python310-toml"

inherit rpm
