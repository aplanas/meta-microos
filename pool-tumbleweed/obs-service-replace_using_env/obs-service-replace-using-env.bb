SUMMARY = "Service for variables substitution"
DESCRIPTION = "This service can be enabled to run during buildtime to replace the placeholders \
in the specified files with the values from the build environment."
LICENSE = "GPL-2.0-or-later"

PV = "0.1"

RPM_NAME = "obs-service-replace_using_env-0.1-2.6.noarch.rpm"
RPM_HASH = "c51f97b1f62775ecc7e8ea172e942a9cd1cb6467c8ac5deff7b1a01d90cc67d69ca6748ada52fb88cfc0b100b80bc6df47737f76e18af6f68fb0ae3c2dd5bea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-replace-using-env"

RDEPENDS:${PN} += "/bin/bash \
bash \
sed"

inherit rpm
