SUMMARY = "Policy to enforce image verification for SLE BCI"
DESCRIPTION = "This package ships a /etc/containers/policy.json which enforces image verification for SLE BCI."
LICENSE = "Apache-2.0"

PV = "20230214"

RPM_NAME = "libcontainers-openSUSE-policy-20230214-8.1.noarch.rpm"
RPM_HASH = "75796675a1c07dbd1b566bac12648f560a8de697081160f6077f13e2df5f6bb79149e0b6938b89c625220d67658a299586bf064de02a7c539a3fa0a2d4f40fb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libcontainers-openSUSE-policy \
libcontainers-openSUSE-policy \
libcontainers-policy"

RDEPENDS:${PN} += ""

inherit rpm
