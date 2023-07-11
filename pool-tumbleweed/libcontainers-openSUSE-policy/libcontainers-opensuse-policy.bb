SUMMARY = "Policy to enforce image verification for SLE BCI"
DESCRIPTION = "This package ships a /etc/containers/policy.json which enforces image verification for SLE BCI."
LICENSE = "Apache-2.0"

PV = "20230214"

RPM_NAME = "libcontainers-openSUSE-policy-20230214-7.1.noarch.rpm"
RPM_HASH = "5c8039439cb752a102aa63f75a556f270d6c1ab99aca3166fd46fdf740f97cbd4016dce3ea4e775127461b9e3c5c25bc204a2851f74edc46aa9003520098a92c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libcontainers-openSUSE-policy \
libcontainers-openSUSE-policy \
libcontainers-policy"

RDEPENDS:${PN} += ""

inherit rpm
