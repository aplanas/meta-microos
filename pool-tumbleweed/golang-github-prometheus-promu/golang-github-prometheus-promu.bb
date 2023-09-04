SUMMARY = "Prometheus Utility Tool"
DESCRIPTION = "The Prometheus Utility Tool is used by the Prometheus project to build other components."
LICENSE = "Apache-2.0"

PV = "0.15.0"

RPM_NAME = "golang-github-prometheus-promu-0.15.0-3.1.aarch64.rpm"
RPM_HASH = "6af43015fdcd3b5e408e6a9b99b05762acac10d370da73a35576f78de6c38d96a6a13d5eb942e19a156d8cf814483455fe9c920f7462ac561ef99e1ec4b05faf"

RPROVIDES:${PN} += "golang-github-prometheus-promu"

RDEPENDS:${PN} += ""

inherit rpm
