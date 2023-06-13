SUMMARY = "Prometheus Utility Tool"
DESCRIPTION = "The Prometheus Utility Tool is used by the Prometheus project to build other components."
LICENSE = "Apache-2.0"

PV = "0.14.0"

RPM_NAME = "golang-github-prometheus-promu-0.14.0-2.1.aarch64.rpm"
RPM_HASH = "89628f16f441464fd6a2271a458a826859fb649062ea0e051262ab02ae29c5b56386fd2aa8ab064e4df40bf5ece2b8eb81cb4e612a916a5a3c8113ea761b0c4e"

RPROVIDES:${PN} += "golang-github-prometheus-promu \
golang-github-prometheus-promu(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
