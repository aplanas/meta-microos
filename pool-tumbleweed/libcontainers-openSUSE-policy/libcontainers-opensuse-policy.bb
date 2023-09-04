SUMMARY = "Policy to enforce image verification for SLE BCI"
DESCRIPTION = "This package ships a /etc/containers/policy.json which enforces image verification for SLE BCI."
LICENSE = "Apache-2.0"

PV = "20230814"

RPM_NAME = "libcontainers-openSUSE-policy-20230814-1.1.noarch.rpm"
RPM_HASH = "d7e32536e37019bcef8577297d215d60762ff288993792a2b2bcb49e82e67ab9ed49ba420694f2363eea9e80ad2fb196575fb2b4d2f2ca0ef23ca6d01b2f3d52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libcontainers-openSUSE-policy \
libcontainers-openSUSE-policy \
libcontainers-policy"

RDEPENDS:${PN} += ""

inherit rpm
