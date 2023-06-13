SUMMARY = "Django settings using TOML configuration files"
DESCRIPTION = "Django settings using TOML configuration files."
LICENSE = "Apache-2.0"

PV = "0.0.4"

RPM_NAME = "python311-django-settings-toml-0.0.4-1.13.noarch.rpm"
RPM_HASH = "ee75ffc7c5febaede1c6f4d16566075d3edaf09e0ddebb717713d22c2a2d57da1473d7ba33f12ca04cf5a1d03d211605ebf97e95baeb051085119d935ff26e48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-settings-toml) \
python311-django-settings-toml \
python3dist(django-settings-toml)"

RDEPENDS:${PN} += "python(abi) \
python311-toml"

inherit rpm
