SUMMARY = "Prometheus Utility Tool"
DESCRIPTION = "The Prometheus Utility Tool is used by the Prometheus project to build other components."
LICENSE = "Apache-2.0"

PV = "0.15.0"

RPM_NAME = "golang-github-prometheus-promu-0.15.0-1.1.aarch64.rpm"
RPM_HASH = "79d62fc2474fd2389df03693d37383aa8cf5dcd500a68fc5792ffe245bb565403b1ffa69d97cdccbdaa434e39afb2855b6008d3f2746b5d6aca3e3319aeef3e3"

RPROVIDES:${PN} += "golang-github-prometheus-promu"

RDEPENDS:${PN} += ""

inherit rpm
