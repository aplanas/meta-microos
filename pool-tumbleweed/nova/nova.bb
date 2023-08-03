SUMMARY = "Find outdated or deprecated Helm charts running in your cluster"
DESCRIPTION = "Nova scans your cluster for installed Helm charts, then cross-checks them against all known Helm repositories. If it finds an updated version of the chart you're using, or notices your current version is deprecated, it will let you know."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "nova-3.7.0-1.1.aarch64.rpm"
RPM_HASH = "f6e610a786a5c7423842cde926bc68df0a6202ea04f773456c953143d0698f80a9c579bff8818da64413c52a9badca4479a10c6a8f77a2272ee49e163136b4b3"

RPROVIDES:${PN} += "nova"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
