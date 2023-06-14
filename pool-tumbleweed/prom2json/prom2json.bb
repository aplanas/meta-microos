SUMMARY = "CLI tool to scrape a Prometheus client and dump the result as JSON"
DESCRIPTION = "The prom2json CLI tool scrapes a Prometheus client \
in protocol buffer or text format \
and dumps the result as JSON to stdout"
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "prom2json-1.3.2-1.3.aarch64.rpm"
RPM_HASH = "1f60c7d98b45aab609bad980df11e5936a87db4b5f01efe77f94a5b1ff47c0918152e480116c6efd7d5df4f4fe5d2254fbc833b4541b6044d5219321ded195a2"

RPROVIDES:${PN} += "prom2json"

RDEPENDS:${PN} += ""

inherit rpm
